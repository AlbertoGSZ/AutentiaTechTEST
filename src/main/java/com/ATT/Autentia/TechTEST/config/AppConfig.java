package com.ATT.Autentia.TechTEST.config;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import javax.sql.DataSource;

@Configuration
@MapperScan("com.ATT.Autentia.TechTEST.repositories")      // Aqui es es donde se van a mapear las sentencias SQL
public class AppConfig {

    @Bean
    public DataSource dataSource() {                       //Se conecta con la BBDD a través de los datos especificados
        SimpleDriverDataSource sdds = new SimpleDriverDataSource();
        sdds.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        sdds.setUrl("jdbc:mysql://127.0.0.1:3306/autentiatechtest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\n");
        sdds.setUsername("root");
        sdds.setPassword("123Alberto%");
        return sdds;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {          //Se gestiona la transacción con la conexión obtenida con el método anterior
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception {         //Se crea la sesión de MyBatis con la conexión obtenida con el primer método
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory;
    }
}