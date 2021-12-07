<!--<?xml version="1.0" encoding="UTF-8"?>-->
<!--<!DOCTYPE generatorConfiguration-->
<!--        PUBLIC "-//mybatis.org//DTD MyBatis Generator Configuration 1.0//EN"-->
<!--        "http://mybatis.org/dtd/mybatis-generator-config_1_0.dtd">-->
<!--<generatorConfiguration>-->
<!--    &lt;!&ndash; 数据库驱动:选择你的本地硬盘上面的数据库驱动包，如果在pom文件中添加了依赖，那么这里就可以注释掉了&ndash;&gt;-->
<!--    &lt;!&ndash;<classPathEntry&ndash;&gt;-->
<!--    &lt;!&ndash;location="E:\Maven\mvnRespo\mysql\mysql-connector-java\5.1.44\mysql-connector-java-5.1.44.jar"/>&ndash;&gt;-->

<!--    &lt;!&ndash; 一个数据库一个context &ndash;&gt;-->
<!--    <context id="bing" targetRuntime="MyBatis3">-->

<!--        &lt;!&ndash; 生成的model实现Serializable借口 &ndash;&gt;-->
<!--        <plugin type="org.mybatis.generator.plugins.SerializablePlugin">-->
<!--            &lt;!&ndash;<property name="suppressJavaInterface" value="true"/>&ndash;&gt;-->
<!--        </plugin>-->

<!--        &lt;!&ndash; 自动生成equals方法和hashcode方法 &ndash;&gt;-->
<!--        <plugin type="org.mybatis.generator.plugins.EqualsHashCodePlugin"/>-->

<!--        &lt;!&ndash; 该插件给实体类添加toString() &ndash;&gt;-->
<!--        <plugin type="org.mybatis.generator.plugins.ToStringPlugin"/>-->

<!--        &lt;!&ndash;<plugin type="org.mybatis.generator.plugins.CaseInsensitiveLikePlugin"/>&ndash;&gt;-->
<!--        <plugin type="org.mybatis.generator.plugins.MapperAnnotationPlugin"/>-->

<!--        <plugin type="org.mybatis.generator.plugins.RowBoundsPlugin"/>-->


<!--        <commentGenerator>-->
<!--            <property name="suppressDate" value="true"/>-->
<!--            &lt;!&ndash; 是否去除自动生成的注释 true：是 ： false:否 &ndash;&gt;-->
<!--            <property name="suppressAllComments" value="false"/>-->
<!--            <property name="addRemarkComments" value="false"/>-->
<!--        </commentGenerator>-->

<!--        &lt;!&ndash;数据库链接URL，用户名、密码 &ndash;&gt;-->
<!--        <jdbcConnection driverClass="com.mysql.jdbc.Driver"-->
<!--                        connectionURL="jdbc:mysql://localhost:3306/cloud-order?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC"-->
<!--                        userId="root"-->
<!--                        password="root1234">-->
<!--        </jdbcConnection>-->

<!--        &lt;!&ndash; 类型转换 &ndash;&gt;-->
<!--        <javaTypeResolver>-->
<!--            &lt;!&ndash; 是否使用bigDecimal， false可自动转化以下类型（Long, Integer, Short, etc.） &ndash;&gt;-->
<!--            <property name="forceBigDecimals" value="false"/>-->
<!--        </javaTypeResolver>-->

<!--        &lt;!&ndash; 生成模型（实体）的包名和位置&ndash;&gt;-->
<!--        <javaModelGenerator targetPackage="net.xdclass.ddao.model" targetProject="src/main/java">-->
<!--            <property name="enableSubPackages" value="true"/>-->
<!--            <property name="trimStrings" value="true"/>-->
<!--        </javaModelGenerator>-->

<!--        &lt;!&ndash; 生成映射文件的包名和位置&ndash;&gt;-->
<!--        <sqlMapGenerator targetPackage="mapping" targetProject="src/main/resources">-->
<!--            <property name="enableSubPackages" value="true"/>-->
<!--        </sqlMapGenerator>-->

<!--        &lt;!&ndash; 生成DAO的包名和位置&ndash;&gt;-->
<!--        &lt;!&ndash; XMLMAPPER生成xml映射文件, ANNOTATEDMAPPER 生成的dao采用注解来写sql &ndash;&gt;-->
<!--        <javaClientGenerator type="XMLMAPPER" targetPackage="net.xdclass.ddao.mapper" targetProject="src/main/java">-->
<!--            <property name="enableSubPackages" value="true"/>-->
<!--        </javaClientGenerator>-->

<!--        &lt;!&ndash; 要生成的表 tableName是数据库中的表名或视图名 domainObjectName是实体类名&ndash;&gt;-->
<!--        <table tableName="video_order" domainObjectName="VideoOrderModel">-->
<!--            <generatedKey column="id" sqlStatement="MySql" identity="true"/>-->
<!--        </table>-->
<!--        &lt;!&ndash; table可以有多个,每个数据库中的表都可以写一个table，tableName表示要匹配的数据库表,也可以在tableName属性中通过使用%通配符来匹配所有数据库表,只有匹配的表才会自动生成文件 &ndash;&gt;-->
<!--        &lt;!&ndash;<table tableName="rel_course_school" domainObjectName="CourseSchoolModel">&ndash;&gt;-->
<!--            &lt;!&ndash;<generatedKey column="id" sqlStatement="MySql" identity="true"/>&ndash;&gt;-->
<!--        &lt;!&ndash;</table>&ndash;&gt;-->

<!--    </context>-->
<!--</generatorConfiguration>-->