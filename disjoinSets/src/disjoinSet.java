public class disjoinSet{

    disjoinSet padre;
    int element;
    int size;

    public disjoinSet(int y, int size) {
        this.element = y;
        this.size = size;
    }

    public disjoinSet(){

    }

    public static void makeSet(disjoinSet e){
        e.padre=e;
        e.size=1;
    }

    public static disjoinSet find(disjoinSet e){
        disjoinSet temp = e;
        while (temp!=temp.padre){
            temp=temp.padre;
        }
        return temp;
    }

    public static void union(disjoinSet e, disjoinSet f){
        disjoinSet temp1 = e;
        disjoinSet temp2 = f;
        while(temp1!=temp1.padre){
            temp1=temp1.padre;
        }
        while(temp2!=temp2.padre){
            temp2=temp2.padre;
        }

        if(temp1 != temp2){
            if(temp1.size <= temp2.size){
                temp1.padre = temp2;
                temp2.size = temp2.size + temp1.size;
            }else{
                temp2.padre = temp1;
                temp1.size = temp1.size + temp2.size;
            }

        }
    }
}

