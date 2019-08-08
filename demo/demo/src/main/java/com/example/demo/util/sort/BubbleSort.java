package com.example.demo.util.sort;
/**
 * 冒泡排序
 * @author 守候
 *
 */
public class BubbleSort {

	/**
	 * 把相邻的元素两两比较，当第一个元素大于右侧相邻元素时，交换他们的位置；
	 * 当一个元素小于或等于右侧相邻元素时，位置不变
	 * @param nums
	 * 最基本的冒泡排序
	 */
	public void sort(int[] nums) {
		int size=nums.length;//获取数组长度
		int temp=0;//临时变量
		for(int i=0;i<size-1;i++) {//控制所有回合，一共进行了size-1轮
			for(int j=0;j<size-i-1;j++) {//每一轮的冒泡处理
				if(nums[j]>nums[j+1]) {//对比相邻位置元素大小，若前面比后面大，则交换位置
					temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		for (int a : nums) {//循环输出数组
			System.out.print(a+"  ");
		}
	}
	
	/**
	 * 把相邻的元素两两比较，当第一个元素大于右侧相邻元素时，交换他们的位置；
	 * 当一个元素小于或等于右侧相邻元素时，位置不变
	 * @param nums
	 * 优化的冒泡排序，如若已经是按照顺序的数组，则能直接跳出循环
	 * 例如{1,2,3,6,5}，只需要交换6和5的位置即可，后面直接挑出循环
	 * 再例如{1,2,3,4,5}这可是直接排序好的，所以会直接跳出循环
	 */
	public void sort2(int[] nums) {
		int size=nums.length;//获取数组长度
		int temp=0;//临时变量
		for(int i=0;i<size-1;i++) {//控制所有回合，一共进行了size-1轮
			boolean isSorted=true;//有序标记，每一轮的初始值都是true
			for(int j=0;j<size-i-1;j++) {//每一轮的冒泡处理
				if(nums[j]>nums[j+1]) {//对比相邻位置元素大小，若前面比后面大，则交换位置
					temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
					//如果有数组进行了交换，则说明数组不是有序的，修改标记为false，继续进行下一轮循环
					isSorted=false;
				}
			}
			if(isSorted) {//如果判断标记为true，说明数组没有进入交换，进一步说明数组已经是有序的，直接跳出循环即可
				break;
			}
		}
		for (int a : nums) {//循环输出数组
			System.out.print(a+"  ");
		}
	}
	
	/**
	 * 把相邻的元素两两比较，当第一个元素大于右侧相邻元素时，交换他们的位置；
	 * 当一个元素小于或等于右侧相邻元素时，位置不变
	 * @param nums
	 * 更进一步优化的冒泡排序，sortBorder就是无序数列的边界，在每一列排序过程中，处于sortBorder之后
	 * 的元素就不需要在进行比较了，肯定是有序的
	 * 例如{4,3,5,6,7}后面是排好序的，就不必进行对比
	 */
	public void sort3(int[] nums) {
		int size=nums.length;//获取数组长度
		int temp=0;//临时变量
		int pos=0;//用来记录最后一次交换次数
		for(int i=0;i<size-1;i++) {//控制所有回合，一共进行了size-1轮
			boolean isSorted=true;//有序标记，每一轮的初始值都是true
			//无序数列的边界，每次比较只需要比到这里为止
			int sortBorder=size-1;
			for(int j=0;j<sortBorder;j++) {//每一轮的冒泡处理
				if(nums[j]>nums[j+1]) {//对比相邻位置元素大小，若前面比后面大，则交换位置
					temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
					//如果有数组进行了交换，则说明数组不是有序的，修改标记为false，继续进行下一轮循环
					isSorted=false;
					//把无序数列的边界更新为最后一次交换元素的位置
					pos=j;
				}
			}
			if(isSorted) {//如果判断标记为true，说明数组没有进入交换，进一步说明数组已经是有序的，直接跳出循环即可
				break;
			}
			sortBorder=pos;//下一次比较到记录位置即可
		}
		for (int a : nums) {//循环输出数组
			System.out.print(a+"  ");
		}
	}
	
	
}
