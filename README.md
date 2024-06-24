# Selection-Sorting
<h2>What is it?</h2>
<p>
  <br>It is a sorting algorithm that selects the smallest element from an unsorted array in each iteration and places that element at the beginning of the unsorted array.<br>
  <br> The algorithm repeatedly selects the smallest element from the unsorted portion of the Array and swaps it with the first element of the unsorted part.<br>
  <br> This process is repeated for the remaining unsorted portion until the entire Array is sorted.<br>
  <br> Total number of max passes is (n-1),where n is size of Array.<br>
  <br>Here in all cases(best,average,worst),time complexity is O(n^2),where n is size of Array.<br>
</p>
<h2>Algorithm</h2>
<p>
  <br>Here,total number of rounds we need to iterate int round from 0 to n-1.<br>
  <br>So,consider an int limit=0;before outer loop and after each inner loop increase value of limit by 1.It will be acting as index till before where Array is sorted.<br>
  <br>In inner loop the variable i should go from limit to n-1.As,after each inner loop the smallest element is swap with element at starting of Array,and the role of limit is to help as swapping index.<br>
  <br>In inner loop check if(arr[limit]>=arr[i]),if it's true then swap values of those two numbers.<br>
  <br>As,after each loop the value of limit increases,thus the inner loop travelling decreases and range of sorted array increases.<br>  
</p>
