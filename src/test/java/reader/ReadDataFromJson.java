package reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;

import data.DataModel;

public class ReadDataFromJson 
{
	public DataModel readData() throws FileNotFoundException{
		//read from json file
		FileReader fileReader = new FileReader("D:\\mostafa\\Eclipse directory\\nobCommerce\\nobCommerceProject\\nobCommerce\\src\\test\\java\\data\\TestData.json");
		//model data
		DataModel dataModel = new Gson().fromJson(fileReader, DataModel.class);
		return dataModel;
	}

}
