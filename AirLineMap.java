package org.tweaktalent.hadoop.AirLineCount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class AirLineMap extends Mapper<LongWritable,Text,Text,IntWritable>{

 
 //public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException {
 public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException {
  
  String[] words = value.toString().split(",");
  //if(words[0].equalsIgnoreCase("2008")) {
   //if(words[17].equalsIgnoreCase("BHM")|| words[17].equalsIgnoreCase("BNA")||words[17].equalsIgnoreCase("cec"))
   //{
   context.write(new Text(words[17]),new IntWritable(1));
  //}
 //}
 }
}