package com.mearkiphi.agro.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaison on 23/01/17.
 */

public class InsertTodoQuery {

    @SerializedName("type")
    String type = "insert";

    @SerializedName("args")
    Args args;

    public InsertTodoQuery(String title, Integer userId) {
        args = new Args();
        args.objects = new ArrayList<>();
        TodoRecord record = new TodoRecord(title,userId, false);
        args.objects.add(record);
    }

    class Args {

        @SerializedName("table")
        String table = "crop-db1";

        @SerializedName("returning")
        String[] returning = {
                "id","title","completed"
        };

        @SerializedName("objects")
        List<TodoRecord> objects;

    }

}
