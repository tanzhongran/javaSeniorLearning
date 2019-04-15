package mybatis;

import mybatis.domain.Member;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * 早期的版本直接通过主配置文件获取mapper.xml
 * 然后直接执行配置文件中的sql来执行sql语句
 * 但是这样无法确定传入的参数是否正确
 */
public class XmlDemo {
    
    public static void main(String[] args) throws Exception{
        //获取sqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //从sessionFactory获取session
        SqlSession session = sqlSessionFactory.openSession();
        //运行mapping的sql
        Member member = (Member)session.selectOne("mybatis.mapper.MemberMapper.getMember", 1);
        System.out.println(member);

    }


}
