function swapValues(arr)
{
	if (arr.length >= 2)
	{
		var temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		return arr;
	}
	else
	{
		return 0;
	}
}
