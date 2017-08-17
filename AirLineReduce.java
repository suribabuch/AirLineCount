package org.tweaktalent.hadoop.AirLineCount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.log4j.Logger;


public class AirLineReduce extends Reducer<Text,IntWritable,Text,IntWritable> {

 Logger logger = Logger.getLogger(AirLineReduce.class);
 public void reduce(Text key,Iterable<IntWritable> values,Context context) throws IOException, InterruptedException {
  
  int sum =0;
  for(IntWritable value:values) {
//   System.out.println("Key:"+ key.toString() + " Values:"+value.get());
   logger.info("Key:"+ key.toString() + " Values:"+value.get());
   sum+= value.get();
  }
  context.write(key, new IntWritable(sum));
 }
}