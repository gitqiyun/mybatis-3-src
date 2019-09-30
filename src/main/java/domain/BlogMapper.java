package domain;

import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    Blog selectBlogById( @Param("id") Integer id,@Param("name")String name);
}
