// Last updated: 10/1/2025, 3:37:36 PM
class Solution {
    public boolean isBalanced(String num) {
        int sum = 0;
        for(int i=0; i<num.length(); i+=2){
            sum += num.charAt(i) - '0';
        }
        int fam = 0;
        for(int i=1; i<num.length() ; i+=2){
            fam += num.charAt(i) - '0';
        }
        if(fam == sum){
            return true;
        }else{
            return false;
        }
    }
}

// Maybe it's the way you say my name
// Maybe it's the way you play your game
// But it's so good, I've never known anybody like you
// But it's so good, I've never dreamed of nobody like you
// And I've heard of a love that comes once in a lifetime
// And I'm pretty sure that you are that love of mine
// 'Cause I'm in a field of dandelions
// Wishing on every one that you'd be mine, mine
// And I see forever in your eyes
// I feel okay when I see you smile, smile
// Wishing on dandelions all of the time
// Praying to God that one day you'll be mine
// Wishing on dandelions all of the time, all of the time
// I think that you are the one for me
// 'Cause it gets so hard to breathe
// When you're looking at me, I've never felt so alive and free
// When you're looking at me, I've never felt so happy
// And I've heard of a love that comes once in a lifetime
// And I'm pretty sure that you are that love of mine
// 'Cause I'm in a field of dandelions
// Wishing on every one that you'd be mine, mine
// And I see forever in your eyes
// I feel okay when I see you smile, smile
// Wishing on dandelions all of the time
// Praying to God that one day you'll be mine
// Wishing on dandelions all of the time
// All of the time
// Dandelion, into the wind you go
// Won't you let my darling know?
// Dandelion, into the wind you go
// Won't you let my darling know that?
// I'm in a field of dandelions
// Wishing on every one that you'd be mine, mine
// Oh, and I see forever in your eyes
// I feel okay when I see you smile, smile
// Wishing on dandelions all of the time
// Praying to God that one day you'll be mine
// Wishing on dandelions all of the time, all of the time
// I'm in a field of dandelions
// Wishing on every one that you'd be mine, mine