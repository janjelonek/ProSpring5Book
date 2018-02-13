/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

import chapter6.entities.Singer;
import chapter6.dao.PlainSingerDao;
import chapter6.dao.SingerDao;
import java.sql.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Janek
 */
public class PlainJdbcDemo {

    private static SingerDao singerDao = new PlainSingerDao();
    private static Logger logger = LoggerFactory.getLogger(PlainJdbcDemo.class);

    public static void main(String[] args) {
        logger.info("Listing initial singer data:");

        listAllSingers();

        logger.info("-------------");
        logger.info("Insert a new singer");

        Singer singer = new Singer();
        singer.setFirstName("Ed");
        singer.setLastName("Sheeran");
        singer.setBirthDate(new Date((new GregorianCalendar(1991, 2, 3))
                .getTime().getTime()));
        singerDao.insert(singer);
        
        logger.info("Listing singer data after new singer created:");
        
        listAllSingers();
        
        logger.info("-------------");
        logger.info("Deleting the previous created singer");
        
        singerDao.delete(singer.getId());
        
        logger.info("Listing singer data after new singer deleted:");
        
        listAllSingers();
    }
    
    private static void listAllSingers() {
        List<Singer> singers = singerDao.findAll();
        
        for (Singer singer : singers) {
            logger.info(singer.toString());
        }
    }
}

