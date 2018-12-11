package MapReduce;

import java.io.IOException;
import java.util.*;

import javax.xml.soap.Text;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;

public class WordCount_MR {
	
	public static class Map extends Mapper<LongWritable, Text, Text, IntWritable>{
		public void map(LongWritable key, Text value, 
				OutputCollector<Text, IntWritable> output, Reporter reporter) 
				throws IOException{
			
		}
		
	}

}

public static class Reduce extends Reducer<Text, IntWritable, Text, IntWritable> {
	public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException{
		
	}
}

public static void main(String[] args) throws Exception {
	JobConf conf = new JobConf(wc.class);
	conf.setJobName("wordcount");
	
	conf.setOutputKeyClass(Text.class);
	conf.setOutputValueClass(IntWritable.class);
	
	conf.setMapperClass(Map.class);
	conf.setReducerClass(Reduce.class);
	
	conf.setInputFormat(TextInputFormat.class);
	conf.setOutputFormat(TextOutputFormat.class);
	
	FileInputFormat.setInputPaths(conf,  new Path(args[0]));
	FileOutputFormat.setOutputPath(conf, new Path(args[1]));
	
	JobClient.runJob(conf);
}