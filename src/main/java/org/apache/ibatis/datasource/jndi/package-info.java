
/**
 *JNDI数据源工厂
 *JNDI: Java 命名与目录接口（Java Naming and Directory Interface），在J2EE规范中是重要的规范之一
 *作用:可以把java应用程序访问数据库管理和配置交给存放java应用的服务器（tomcat）
 *示例
 * mybatis中配置
 * 	<environments default="development">
 *         <environment id="development">
 *             <transactionManager type="JDBC" />
 *             <dataSource type="JNDI">
 *                 <property name="data_source" value="java:comp/env/jndi/mybatis"/>
 *             </dataSource>
 *         </environment>
 *     </environments>
 *
 * tomcat配置有许多种，这里使用在conf目录下配置context.xml
 * 	<Resource name="jndi/mybatis"  
 *                 auth="Container"   
 *                 type="javax.sql.DataSource"   
 *                 driverClassName="oracle.jdbc.driver.OracleDriver"   
 *                 url="jdbc:oracle:thin:@xxxxxxxxxxxxx:htfuat"  
 *                 username="xx"   
 *                 password="xx"   
 *                 poolMaximumActiveConnections="20"   
 *                 poolMaximumIdleConnections="10"   
 *                 poolMaximumCheckoutTime="10000"/>
 *
 * 关键是datasrouce type=jndi，data_source的内容为java:comp/env/xxxx 其中xxx是你的名字，前面java:comp/env/是jndi的规定前缀
 */
package org.apache.ibatis.datasource.jndi;
