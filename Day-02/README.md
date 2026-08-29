# 🚀 Day 02 — Prefix Sum & Subarrays

**100 Days DSA Challenge — Day 02/100**

---

## 🎯 Focus

- Prefix Sum
- Range Sum
- Subarray Fundamentals
- Prefix Sum + HashMap
- Zero-Sum Subarray
- Subarray Sum = K
- Prefix Sum + Modulo
- Fixed-Size Sliding Window

---

## 💻 LeetCode Problems

| # | Problem | Difficulty | Status |
|---|---|---|---|
| 1 | [303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/) | Easy | ✅ |
| 2 | [724. Find Pivot Index](https://leetcode.com/problems/find-pivot-index/) | Easy | ✅ |
| 3 | [2270. Number of Ways to Split Array](https://leetcode.com/problems/number-of-ways-to-split-array/) | Medium | ✅ |
| 4 | [560. Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Medium | ✅ |
| 5 | [523. Continuous Subarray Sum](https://leetcode.com/problems/continuous-subarray-sum/) | Medium | ✅ |
| 6 | [974. Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/) | Medium | ✅ |
| 7 | [930. Binary Subarrays With Sum](https://leetcode.com/problems/binary-subarrays-with-sum/) | Medium | ✅ |

---

## 🟢 GeeksforGeeks Problems

| # | Problem | Difficulty | Status |
|---|---|---|---|
| 1 | [Zero Sum Subarray](https://www.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1) | Easy | ✅ |
| 2 | [Longest Subarray with 0 Sum](https://www.geeksforgeeks.org/dsa/find-the-largest-subarray-with-0-sum/) | Medium | ✅ |
| 3 | [Maximum Sum Subarray of Size K](https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1) | Medium | ✅ |
| 4 | [Subarrays with 0 Sum](https://www.geeksforgeeks.org/dsa/short-notes-hashing-and-prefix-sums/) | Medium | ✅ |

---

## 🧠 Patterns Practiced

- **Prefix Sum** — Store cumulative sums to avoid repeated calculations.
- **Prefix Sum + HashMap** — Find and count subarrays with a target sum.
- **Prefix Sum + Modulo** — Solve divisibility-based subarray problems.
- **Left & Right Sum** — Find pivot/balance positions efficiently.
- **Fixed-Size Sliding Window** — Maintain a moving window sum in `O(n)`.

---

## 📌 Important Formulas

### Prefix Sum

```text
prefix[i] = prefix[i - 1] + nums[i]
