<h2><a href="https://leetcode.com/problems/linked-list-cycle">141. Linked List Cycle</a></h2>
<h3>Easy</h3>
<hr>
<p>Given <code>head</code>, the head of a linked list, determine if the linked list has a cycle in it.</p>
<p>There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the <code>next</code> pointer.</p>

<p><strong class="example">Example 1:</strong></p>
<pre>
<strong>Input:</strong> head = [3,2,0,-4], pos = 1
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<pre>
<strong>Input:</strong> head = [1,2], pos = 0
<strong>Output:</strong> true
</pre>

<p><strong>Constraints:</strong></p>
<ul>
    <li>The number of nodes is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
    <li><code>-10<sup>5</sup> &lt;= Node.val &lt;= 10<sup>5</sup></code></li>
</ul>
