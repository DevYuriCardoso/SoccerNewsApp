package com.yuno.soccernewsoficial.data.remote.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.yuno.soccernewsoficial.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NewsDao newsDao();

}