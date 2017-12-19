package fi.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

    @RestController
    @CrossOrigin
    public class MyRestController {

        private final Logger LOG = LoggerFactory.getLogger(MyRestController.class);
        @Autowired
        BloggerRepository database;

        @PostConstruct
        public void init(){

        }
        @RequestMapping(value="/bloggers", method = RequestMethod.POST)
        public void saveBlogger(@RequestBody Blogger c){
            LOG.info("Saving blog..");
            database.save(c);
        }

        @RequestMapping(value="/bloggers", method = RequestMethod.GET)
        public Iterable<Blogger> fetchBlogger(){
            LOG.info("Finding all customers..");

            return database.findAll();
        }
        @RequestMapping(value="/bloggers/{bloggerId}", method = RequestMethod.GET)
        public Blogger fetchBlogger(@PathVariable("bloggerId") Long bloggerId){
            return database.findOne(bloggerId);
        }
        @RequestMapping(value="/bloggers/{bloggerId}", method = RequestMethod.DELETE)
        public void deleteBlogger(@PathVariable("bloggerId") Long bloggerId){

            database.delete(database.findOne(bloggerId));
        }
    }

