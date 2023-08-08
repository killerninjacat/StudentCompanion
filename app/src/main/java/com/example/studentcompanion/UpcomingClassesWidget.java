package com.example.studentcompanion;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.widget.RemoteViews;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UpcomingClassesWidget extends AppWidgetProvider {

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.upcoming_classes_widget);
        int textColor = ContextCompat.getColor(context, R.color.black);
        views.setTextColor(R.id.appwidget_text, textColor);
        Calendar calendar= Calendar.getInstance();
        int day=calendar.get(Calendar.DAY_OF_WEEK);
        SharedPreferences sp1;
        sp1 = context.getSharedPreferences("com.example.studentcompanion", 0);
        List<String> classes=new ArrayList<>();
        List<Double> times=new ArrayList<>();
        int hour,min=0,f=0;
        Gson gson=new Gson();

        switch (day)
        {
            case Calendar.SUNDAY:
                classes=gson.fromJson(sp1.getString("sundayClasses",null),ArrayList.class);
                times=gson.fromJson(sp1.getString("sundayTimes",null),ArrayList.class);
                if(classes==null)
                    classes=new ArrayList<>();
                if(times==null)
                    times=new ArrayList<>();
                hour=calendar.get(Calendar.HOUR_OF_DAY);
                min=0;
                for(int i=0;i<times.size();i++)
                {
                    if(times.get(i)/60-hour>=0) {
                        min = i;
                        f=1;
                    }
                }
                if(f==0)
                    views.setTextViewText(R.id.appwidget_text,"No more classes today!");
                else {
                    int h=(int)(times.get(min)/60);
                    int m=(int)(times.get(min)%60);
                    views.setTextViewText(R.id.appwidget_text, classes.get(min) + " at " + h+ ":" + m);
                }
                break;
            case Calendar.MONDAY:
                classes=gson.fromJson(sp1.getString("mondayClasses",null),ArrayList.class);
                times=gson.fromJson(sp1.getString("mondayTimes",null),ArrayList.class);
                if(classes==null)
                    classes=new ArrayList<>();
                if(times==null)
                    times=new ArrayList<>();
                hour=calendar.get(Calendar.HOUR_OF_DAY);
                min=0;
                for(int i=0;i<times.size();i++)
                {
                    if(times.get(i)/60-hour>=0) {
                        min = i;
                        f=1;
                    }
                }
                if(f==0)
                    views.setTextViewText(R.id.appwidget_text,"No more classes today!");
                else {
                    int h=(int)(times.get(min)/60);
                    int m=(int)(times.get(min)%60);
                    views.setTextViewText(R.id.appwidget_text, classes.get(min) + " at " + h+ ":" + m);
                }
                break;
            case Calendar.TUESDAY:
                classes=gson.fromJson(sp1.getString("tuesdayClasses",null),ArrayList.class);
                times=gson.fromJson(sp1.getString("tuesdayTimes",null),ArrayList.class);
                if(classes==null)
                    classes=new ArrayList<>();
                if(times==null)
                    times=new ArrayList<>();
                hour=calendar.get(Calendar.HOUR_OF_DAY);
                min=0;
                for(int i=times.size()-1;i>=0;i--)
                {
                    if(times.get(i)/60-hour>=0) {
                            min = i;
                            f=1;
                    }
                }
                if(f==0)
                    views.setTextViewText(R.id.appwidget_text,"No more classes today!");
                else {
                    int h=(int)(times.get(min)/60);
                    int m=(int)(times.get(min)%60);
                    views.setTextViewText(R.id.appwidget_text, classes.get(min) + " at " + h+ ":" + m);
                }
                break;
            case Calendar.WEDNESDAY:
                classes=gson.fromJson(sp1.getString("wednesdayClasses",null),ArrayList.class);
                times=gson.fromJson(sp1.getString("wednesdayTimes",null),ArrayList.class);
                if(classes==null)
                    classes=new ArrayList<>();
                if(times==null)
                    times=new ArrayList<>();
                hour=calendar.get(Calendar.HOUR_OF_DAY);
                min=0;
                for(int i=0;i<times.size();i++)
                {
                    if(times.get(i)/60-hour>=0) {
                        min = i;
                        f=1;
                    }
                }
                if(f==0)
                    views.setTextViewText(R.id.appwidget_text,"No more classes today!");
                else {
                    int h=(int)(times.get(min)/60);
                    int m=(int)(times.get(min)%60);
                    views.setTextViewText(R.id.appwidget_text, classes.get(min) + " at " + h+ ":" + m);
                }
                break;
            case Calendar.THURSDAY:
                classes=gson.fromJson(sp1.getString("thursdayClasses",null),ArrayList.class);
                times=gson.fromJson(sp1.getString("thursdayTimes",null),ArrayList.class);
                if(classes==null)
                    classes=new ArrayList<>();
                if(times==null)
                    times=new ArrayList<>();
                hour=calendar.get(Calendar.HOUR_OF_DAY);
                min=0;
                for(int i=0;i<times.size();i++)
                {
                    if(times.get(i)/60-hour>=0) {
                        min = i;
                        f=1;
                    }
                }
                if(f==0)
                    views.setTextViewText(R.id.appwidget_text,"No more classes today!");
                else {
                    int h=(int)(times.get(min)/60);
                    int m=(int)(times.get(min)%60);
                    views.setTextViewText(R.id.appwidget_text, classes.get(min) + " at " + h+ ":" + m);
                }
                break;
            case Calendar.FRIDAY:
                classes=gson.fromJson(sp1.getString("fridayClasses",null),ArrayList.class);
                times=gson.fromJson(sp1.getString("fridayTimes",null),ArrayList.class);
                if(classes==null)
                    classes=new ArrayList<>();
                if(times==null)
                    times=new ArrayList<>();
                hour=calendar.get(Calendar.HOUR_OF_DAY);
                min=0;
                for(int i=0;i<times.size();i++)
                {
                    if(times.get(i)/60-hour>=0) {
                        min = i;
                        f=1;
                    }
                }
                if(f==0)
                    views.setTextViewText(R.id.appwidget_text,"No more classes today!");
                else {
                    int h=(int)(times.get(min)/60);
                    int m=(int)(times.get(min)%60);
                    views.setTextViewText(R.id.appwidget_text, classes.get(min) + " at " + h+ ":" + m);
                }
                break;
            case Calendar.SATURDAY:
                classes=gson.fromJson(sp1.getString("saturdayClasses",null),ArrayList.class);
                times=gson.fromJson(sp1.getString("saturdayTimes",null),ArrayList.class);
                if(classes==null)
                    classes=new ArrayList<>();
                if(times==null)
                    times=new ArrayList<>();
                hour=calendar.get(Calendar.HOUR_OF_DAY);
                min=0;
                for(int i=times.size()-1;i>=0;i--)
                {
                    if(times.get(i)/60-hour>=0) {
                        min = i;
                        f=1;
                    }
                }
                if(f==0)
                    views.setTextViewText(R.id.appwidget_text,"No more classes today!");
                else {
                    int h=(int)(times.get(min)/60);
                    int m=(int)(times.get(min)%60);
                    views.setTextViewText(R.id.appwidget_text, classes.get(min) + " at " + h+ ":" + m);
                }
                break;
            default:
                views.setTextViewText(R.id.appwidget_text,"default");
        }
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, UpcomingClassesWidget.class);
        intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
        intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        long updateInterval = AlarmManager.INTERVAL_HOUR;
        alarmManager.setRepeating(AlarmManager.RTC, System.currentTimeMillis(), updateInterval, pendingIntent);
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}