var word1 = "abcd";
var word2 ="pq";

// constrains


var result ="";


for (i=0; i<Math.max(word1.length, word2.length); i++){ // 
    if (word1[i] && word2[i]){
        result+=word1[i]+word2[i] 
    }else if (!word1[i]){
        result+=word2[i]
    }else if(!word2[i]){
        result+=word1[i]
    }
    
}

console.log(result)