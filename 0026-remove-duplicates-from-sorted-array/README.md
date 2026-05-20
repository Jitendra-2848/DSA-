<h2><a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">26. Remove Duplicates from Sorted Array</a></h2>
<h3>Easy</h3>
<hr>
<p>Given an integer array <code>nums</code> sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.</p>
<p>Return <code>k</code> after placing the final result in the first <code>k</code> slots of <code>nums</code>. Do not allocate extra space for another array.</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> nums = [1,1,2]
<strong>Output:</strong> 2, nums = [1,2,_]
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> nums = [0,0,1,1,1,2,2,3,3,4]
<strong>Output:</strong> 5, nums = [0,1,2,3,4,_,_,_,_,_]
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li><code>1 &lt;= nums.length &lt;= 3 * 10<sup>4</sup></code></li>
    <li><code>-100 &lt;= nums[i] &lt;= 100</code></li>
    <li><code>nums</code> is sorted in non-decreasing order.</li>
</ul>
