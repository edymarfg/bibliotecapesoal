package br.com.triersistemas.bibliotecapessoal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguracao {

    @Bean
    public DataSource dataSource(){
        String url = "jdbc:postgresql://db:5432/postgres";
        String usuario = "postgres";
        String senha = "myscretpassword";

        return new DriverManagerDataSource(url, usuario, senha);
    }
}
