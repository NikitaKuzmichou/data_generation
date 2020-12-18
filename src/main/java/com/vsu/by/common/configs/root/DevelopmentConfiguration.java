package com.vsu.by.common.configs.root;

import com.vsu.by.common.configs.db.PostgreSqlDbConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class DevelopmentConfiguration {
    private PostgreSqlDbConfiguration dbConfig = new PostgreSqlDbConfiguration();

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
                                          DriverManagerDataSource dataSource) {
        LocalContainerEntityManagerFactoryBean
                entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setPackagesToScan(
                "com.vsu.by.entities.category",
                "com.vsu.by.entities.customer",
                "com.vsu.by.entities.product",
                "com.vsu.by.entities.purchase",
                "com.vsu.by.entities.seller"
        );
        entityManagerFactoryBean.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setJpaProperties(this.getJpaProperty());
        return entityManagerFactoryBean;
    }

    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dataSource = this.dbConfig.dataSource();
        return dataSource;
    }

    private Properties getJpaProperty() {
        Properties props = new Properties();
        props.setProperty("hibernate.dialect",
                                  "org.hibernate.dialect.PostgreSQL92Dialect");
        props.setProperty("spring.jpa.hibernate.ddl-auto", "update");
        props.setProperty("hibernate.show_sql", "true");
        props.setProperty("hibernate.format_sql", "true");
        props.setProperty("logging.level.org.hibernate.SQL", "DEBUG");
        props.setProperty("hibernate.use_sql_comments","true");
        return props;
    }
}
