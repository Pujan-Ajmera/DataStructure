
public class IntegerToWords {
    
    public static void main(String[] args) {
        String ans = val(50868);
        String[] a = ans.split(" ");
        String va="";
        for(int i=0;i<a.length;i++){
            if(a[i].length()!=0){
                va+=a[i]+" ";
            }
        }
        System.out.print(va.trim());
        
    }
    
    public static String val(int n){
        String s="";
        String[] ones={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String[] tens={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] val={"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        
        // 2147483645
        //two billion 
        //one hundred forty-seven million 
        //four hundred eighty-three thousand 
        //six hundred 
        
        if(n>=1000000000){
            s+=ones[n/1000000000]+" Billion ";
            n=n%1000000000;
        }
        if(n>=1000000){
            s+=val(n/1000000)+" Million ";
            n=n%1000000;
        }
        if(n>=1000){
            s+=val(n/1000)+" Thousand ";
            n=n%1000;
        }
        if(n>=100){
            s+=ones[n/100]+" Hundred ";
            n=n%100;
        }
        if(n>=20){
            s+=val[n/10-2]+" ";
            n=n%10;
        }else if(n>=10){
            s+=tens[n%10]+"";
        }
        if(n>=1&&n<10){
            s+=ones[n];
        }
        
        return s;
    }
    
}