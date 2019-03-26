The intuition here is that the repeated numbers have to appear either next 
to each other (A[i] == A[i + 1]), or alternated (A[i] == A[i + 2]).
 
The only exception is sequences like [2, 1, 3, 2]. In this case, the result
is the last number, so we just return it in the end. This solution has O(n)
runtime.
