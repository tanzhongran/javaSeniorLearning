package mybatis;

import mybatis.domain.Member;
import mybatis.mapper.MemberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MapperDemo {
    public static void main(String[] args) throws Exception{
        //1.获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2.从sessionFactory获取session
        SqlSession session = sqlSessionFactory.openSession();

        //3.获取sqlMapper接口的代理类，并执行sql
        try{
            MemberMapper mapper = session.getMapper(MemberMapper.class);
            Member member = mapper.getMember(1);
            System.out.println(member);
        }finally{
            session.close();
        }
    }
    
}
