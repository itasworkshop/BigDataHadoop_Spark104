package com.mysite.cardstest;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class CardsMapper extends Mapper<LongWritable, Text, Text, IntWritable>{

	protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException{
		
		context.write(new Text(value.toString().split("//|")[0]), new IntWritable(1));

		//step -1
		//BLACK|SPADE|Q --> BLACK, 1
		//BLACK|SPADE|Q --> BLACK, 1

		//step -2
		//BLACK --> [1,1]

		//step-3
		//BlACK, 2
	}
}
