package com.relax.dao;

import com.relax.model.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NewsDao {

    News selectNewsById(@Param("newsId") int newsId);

    News selectNewsByChannelName(@Param("channelName") String channelName);

    int insertNews(@Param("news")News news);

    List<News> selectAllNews();
}
