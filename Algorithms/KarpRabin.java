/*
    Karp Rabin Algorithm

    string s = "sahil"
    string t = "vijaywashingsahilrahul"

    does string s exists in string t
    can we do this in linear time -> O(n+m)
    hashing is used in google search

    h(a) = h(b)[i:i+len(a)]
    1. h(a) = h(b)[i:i+len(a)] then maybe we have found a match check every character time complexity O(a)
       if all characters are equal we have found our answer
    Amotised cost per i index = O(1)
    Time = O( len(t)+len(s) * cost of hash function )

 */

import java.util.*;
class KarpRabin{

}