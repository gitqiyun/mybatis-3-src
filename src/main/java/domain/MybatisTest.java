package domain;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;


public class MybatisTest {
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //核心步骤，加载所有相关配置,会将所有信息封装到configuration类中
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //sqlSession用于使用MyBatis的主要Java接口
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try {
            BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
            Integer id=101;
            String name="tom";
            Blog blog = blogMapper.selectBlogById(id,name);
            System.out.println(blog.getId());
        } finally {
            sqlSession.close();
        }
    }
}
