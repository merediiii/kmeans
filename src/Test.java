
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public  static void main(String[] args)  
    {  
        //��ʼ��һ��Kmean���󣬽�k��Ϊ3
		int num;
		System.out.println("����Ҫ��Ϊ��������");			
		num=(new Scanner(System.in)).nextInt();
        k_means k=new k_means(num);  
        ArrayList<float[]> dataSet=new ArrayList<float[]>();  
        ReadData rd=new ReadData();
        String fileName="11.txt";
		dataSet=rd.read(fileName);
        //����ԭʼ���ݼ�  
        k.setDataSet(dataSet);  
        //ִ���㷨  
        k.kmeans();
        //�õ�������  
        ArrayList<ArrayList<float[]>> cluster=k.getCluster();  
        //�鿴���  
        for(int i=0;i<cluster.size();i++)  
        {  
            k.printDataArray(cluster.get(i), "cluster["+i+"]");  
        }    
    }  
}
