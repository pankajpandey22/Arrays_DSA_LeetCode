# 🚀 Array Data Structures & Algorithms

A structured collection of Array problems, patterns, and optimal solutions implemented in clean, well-documented code.

## 📌 Repository Overview
This repository contains solutions to common Array problems categorized by difficulty and problem-solving patterns. Problems that utilize auxiliary structures (such as HashMaps, Heaps, or Stacks) are tagged accordingly.

---

## 📂 Topic & Pattern Breakdown

| Pattern / Sub-topic | Key Concept | Example Problems |
| :--- | :--- | :--- |
| **Basic Traversal & Math** | Indexing, prefix sums, running totals | Running Sum, Kadane's Algorithm |
| **Two Pointers** | Opposite ends or fast/slow pointers | 3Sum, Container With Most Water, Trapping Rain Water |
| **Sliding Window** | Subarray tracking with fixed/dynamic size | Maximum Subarray Sum, Longest Substring |
| **Array + HashMap** | Fast lookups ($O(1)$) to avoid nested loops | Two Sum, Subarray Sum Equals K, Longest Consecutive Sequence |
| **Sorting & Searching** | In-place partitioning, binary search | Merge Sort, Binary Search on Rotated Array |

---

## 🛠️ Common Pitfalls Avoided
* **Off-by-one errors:** Checking bounds (`i < n` vs. `i <= n`) to prevent `ArrayIndexOutOfBoundsException`.
* **Unnecessary nested loops:** Replacing $O(N^2)$ brute-force scans with HashMaps or sorting where applicable.
* **Unintended mutations:** Making copies of input arrays when original order must be preserved.

---

# 🚀 Data Structures & Algorithms — Array Solutions

Personal repository of solved LeetCode problems in Java, focusing on optimal time/space complexity and clean code.

---

## 📊 Solved Problems Tracker

| # | Problem Name | Difficulty | Time Complexity | Space Complexity | Solution Link |
| :---: | :--- | :---: | :--- | :---: |
| 0001 | Two Sum | O(N) | O(N) | [Java](./Two_Sum.java) |
| 0026 | Remove Duplicates from Sorted Array | O(N) | O(1) | [Java](./Remove_Duplicates_from_Sorted_Array.java) |
| 0189 | Rotate Array | O(N) | O(1) | [Java](./Rotate_Array.java) |
| 1752 | Check if Array Is Sorted and Rotated | O(N) | O(1) | [Java](./Check_if_Array_is_Sorted_and_Rotated.java) |
