package ProjectSplitWise;
import java.util.*;
public class Accounts {
	String A;
	String B;
	String C;
	String D;
String reason;	
int Aspent;
int Bspent;
int Cspent;
int Dspent;
double AtoA;
double AtoB;
double AtoC;
double AtoD;
double BtoA;
double BtoB;
double BtoC;
double BtoD;
double CtoA;
double CtoB;
double CtoC;
double CtoD;
double DtoA;
double DtoB;
double DtoC;
double DtoD;
Map <Integer,String> name= new LinkedHashMap();//Make it a map.
List<Integer> eachI= new LinkedList();
List <Accounts> AccountList=new LinkedList();//Yet we are not adding all Instance variables to the list.
List<String> Summary=new ArrayList();
public Accounts() {}
public Accounts(String a, String b, String c, String d) {

	A = a;
	B = b;
	C = c;
	D = d;
}
public Accounts(String reason, int aspent, int bspent, int cspent, int dspent, double atoA,
		double atoB, double atoC, double atoD, double btoA, double btoB, double btoC, double btoD, double ctoA, double ctoB, double ctoC, double ctoD,
		double dtoA, double dtoB, double dtoC, double dtoD) {
	this.reason=reason;
	Aspent = aspent;
	Bspent = bspent;
	Cspent = cspent;
	Dspent = dspent;
	AtoA = atoA;
	AtoB = atoB;
	AtoC = atoC;
	AtoD = atoD;
	BtoA = btoA;
	BtoB = btoB;
	BtoC = btoC;
	BtoD = btoD;
	CtoA = ctoA;
	CtoB = ctoB;
	CtoC = ctoC;
	CtoD = ctoD;
	DtoA = dtoA;
	DtoB = dtoB;
	DtoC = dtoC;
	DtoD = dtoD;
	
}
@Override
public String toString() {
	return "Accounts [reason=" + reason + ", Aspent=" + Aspent
			+ ", Bspent=" + Bspent + ", Cspent=" + Cspent + ", Dspent=" + Dspent + ", AtoA=" + AtoA + ", AtoB=" + AtoB
			+ ", AtoC=" + AtoC + ", AtoD=" + AtoD + ", BtoA=" + BtoA + ", BtoB=" + BtoB + ", BtoC=" + BtoC + ", BtoD="
			+ BtoD + ", CtoA=" + CtoA + ", CtoB=" + CtoB + ", CtoC=" + CtoC + ", CtoD=" + CtoD + ", DtoA=" + DtoA
			+ ", DtoB=" + DtoB + ", DtoC=" + DtoC + ", DtoD=" + DtoD +  "]";
}
public static void main(String[] args) {
	Accounts n1= new Accounts();
	Scanner s1=new Scanner(System.in);
	int loopInput;
	boolean bol;
	 int iternaryI=0;
	StringBuffer p=new StringBuffer("");
	int AspentI;
	int BspentI;
	int CspentI;
	int DspentI;
	double AtoAI;
	double AtoBI;
	double AtoCI;
	double AtoDI;
	double BtoAI;
	double BtoBI;
	double BtoCI;
	double BtoDI;
	double CtoAI;
	double CtoBI;
	double CtoCI;
	double CtoDI;
	double DtoAI;
	double DtoBI;
	double DtoCI;
	double DtoDI;
	System.out.println(".............................Welcome to SplitWise....................................");
	
	
	System.out.println("Enter the name of the person 1");
	String a= s1.next();
	n1.name.put(1,a);
    System.out.println("Enter the name of the person 2");
    String b= s1.next();
    n1.name.put(2,b);
    System.out.println("Enter the name of the person 3");
    String c= s1.next();
    n1.name.put(3,c);
    System.out.println("Enter the name of the person 4");
    String d= s1.next();
    n1.name.put(4,d);
    System.out.println("Trip has Started!");
    do {//...............................................................................
    	p.delete(0,p.length());
    	//p;//You can ues this too
    	 n1.eachI.clear();
loopInput=0;
bol=true;
iternaryI++;
    	 AspentI=0;
    	BspentI=0;
    	CspentI=0;
    	DspentI=0;
    	AtoAI=0;
    	AtoBI=0;
    	AtoCI=0;
    	AtoDI=0;
    	BtoAI=0;
    	BtoBI=0;
    	BtoCI=0;
    	BtoDI=0;
    	CtoAI=0;
    	CtoBI=0;
    	 CtoCI=0;
    	 CtoDI=0;
    	 DtoAI=0;
    	 DtoBI=0;
    	 DtoCI=0;
    	 DtoDI=0;
    System.out.println("Expense: "+iternaryI);
    String reasonI = s1.next();
    System.out.println("Paid by: ");
    int personI = s1.nextInt();
    System.out.println("Paid Money: ");
     int spentI = s1.nextInt();
    if(personI==1)AspentI=spentI ;
    if(personI==2)BspentI=spentI ;
    if(personI==3)CspentI=spentI ;
    if(personI==4)DspentI=spentI ; 
    
    
    
    System.out.println("Number of people splitting the "+reasonI+" expense: ");
    int numI = s1.nextInt();
    System.out.println("Splited Among: ");
    for(int i=0;i<numI;i++) {
    System.out.print(" ");
    n1.eachI.add(s1.nextInt());
    }
    double split=(double)(spentI/numI);
	
	if(personI==1) {//Iterate eachI
		Iterator it= n1.eachI.iterator();
		while(it.hasNext()) {
			Integer e1=(Integer)it.next();//Giving= +ve. Getting = -ve.
			if(e1==1) {
				AtoAI=split;
			}; 
			if(e1==2) {
				AtoBI=split;
				BtoAI=-split;
			};
			if(e1==3) {
				AtoCI=split;
				CtoAI=-split;
			};
			if(e1==4) {
				 AtoDI=split;
				 DtoAI=-split;
			};
	}
		}
	if(personI==2) {Iterator it= n1.eachI.iterator();
	while(it.hasNext()) {
		Integer e1=(Integer)it.next();
		if(e1==1) {
			BtoAI=split;
			AtoBI=-split;
		};
		if(e1==2) {
			BtoBI=split;
		};
		if(e1==3) {
			BtoCI=split;
			CtoBI=-split;
		};
		if(e1==4) {
			 BtoDI=split;
			 DtoBI=-split;
		};
}	
	}
	if(personI==3) {Iterator it= n1.eachI.iterator();
	while(it.hasNext()) {
		Integer e1=(Integer)it.next();
		if(e1==1) {
			CtoAI=split;
			AtoCI=-split;
		};
		if(e1==2) {
			CtoBI=split;
			BtoCI=-split;
		};
		if(e1==3) {
			CtoCI=split;
		};
		if(e1==4) {
			 CtoDI=split;
			 DtoCI=-split;
		};
}	
	}
	if(personI==4) {
		Iterator it= n1.eachI.iterator();
	while(it.hasNext()) {
		Integer e1=(Integer)it.next();
		if(e1==1) {
			DtoAI=split;
			AtoDI=-split;
		};
		if(e1==2) {
			DtoBI=split;
			BtoDI=-split;
		};
		if(e1==3) {
			DtoCI=split;
			CtoDI=-split;
		};
		if(e1==4) {
			 DtoDI=split;
		};
}	
	}

	Accounts ref1=new Accounts(reasonI,AspentI, BspentI, CspentI, DspentI, AtoAI,
			AtoBI, AtoCI, AtoDI, BtoAI, BtoBI, BtoCI, BtoDI, CtoAI, CtoBI, CtoCI, CtoDI,
			DtoAI, DtoBI, DtoCI, DtoDI);
	
	
		
	if(ref1.Aspent>0) {
		//System.out.print(" "+n1.name.get(1)+" paid "+ref1.Aspent+" Repees. To be splitted among :");
		p.append("Expense "+iternaryI+": For "+ref1.reason+" "+n1.name.get(1)+" paid "+ref1.Aspent+" Repees. To be splitted among :");
		 
		
		if(ref1.AtoA!=0)p.append(" "+"himself"+",");//System.out.print(" "+"himself"+",");
		
		if(ref1.AtoB!=0)p.append(" "+n1.name.get(2)+",");//System.out.print(" "+n1.name.get(2)+",");
		
		if(ref1.AtoC!=0)p.append(" "+n1.name.get(3)+",");//System.out.print(" "+n1.name.get(3)+",");
		
		if(ref1.AtoD!=0)p.append(" "+n1.name.get(4)+",");//System.out.print(" "+n1.name.get(4)+",");

	
		
	}
	if(ref1.Bspent>0) {
		 p.append("Expense "+iternaryI+": For "+ref1.reason+" "+n1.name.get(2)+" paid "+ref1.Bspent+" Repees. To be splitted among :");
		if(ref1.BtoA!=0)p.append(" "+n1.name.get(1)+",");
		if(ref1.BtoB!=0)p.append(" "+"himself"+",");
		if(ref1.BtoC!=0)p.append(" "+n1.name.get(3)+",");
		if(ref1.BtoD!=0)p.append(" "+n1.name.get(4)+",");
	}
	if(ref1.Cspent>0) {
		 p.append("Expense "+iternaryI+": For "+ref1.reason+" "+n1.name.get(3)+" paid "+ref1.Cspent+" Repees. To be splitted among :");
		if(ref1.CtoA!=0) p.append(" "+n1.name.get(1)+",");
		if(ref1.CtoB!=0) p.append(" "+n1.name.get(2)+",");
		if(ref1.CtoC!=0) p.append(" "+"himself"+",");
		if(ref1.CtoD!=0)	p.append(" "+n1.name.get(4)+",");
	}
	if(ref1.Dspent>0) {
		p.append("Expense "+iternaryI+": For "+ref1.reason+" "+n1.name.get(4)+" paid "+ref1.Dspent+" Repees. To be splitted among :");
		if(ref1.DtoA!=0)p.append(" "+n1.name.get(1)+",");	
		if(ref1.DtoB!=0)p.append(" "+n1.name.get(2)+",");
		if(ref1.DtoC!=0)p.append(" "+n1.name.get(3)+",");
		if(ref1.DtoD!=0)p.append(" "+"himself"+",");
	}
	System.out.println(p);
	String q= p.toString();
	n1.Summary.add(q);
	n1.AccountList.add(ref1);
	System.out.println();
	System.out.println("Done splitting bill!");
	System.out.println("Enter 1 to end the trip.");
	System.out.println("Enter 2 to add expense.");
	loopInput= s1.nextInt();
	if (loopInput==1)bol=false;
    }while(bol);//.........................................................................
    
    
    int iternary=0;
	AspentI=0;
 	BspentI=0;
 	CspentI=0;
 	DspentI=0;
 	AtoAI=0;
 	AtoBI=0;
 	AtoCI=0;
 	AtoDI=0;
 	BtoAI=0;
 	BtoBI=0;
 	BtoCI=0;
 	BtoDI=0;
 	CtoAI=0;
 	CtoBI=0;
 	CtoCI=0;
 	CtoDI=0;
 	DtoAI=0;
 	DtoBI=0;
 	DtoCI=0;
 	DtoDI=0;
 	 
	Iterator it2= n1.AccountList.iterator();
	while(it2.hasNext()) {
		Accounts e1=(Accounts)it2.next();
	 	 AspentI+=e1.Aspent;
	    	BspentI+=e1.Bspent;
	    	CspentI+=e1.Cspent;
	    	DspentI+=e1.Dspent;
	    	AtoAI+=e1.AtoA;
	    	AtoBI+=e1.AtoB;
	    	AtoCI+=e1.AtoC;
	    	AtoDI+=e1.AtoD;
	    	BtoAI+=e1.BtoA;
	    	BtoBI+=e1.BtoB;
	    	BtoCI+=e1.BtoC;
	    	BtoDI+=e1.BtoD;
	    	CtoAI+=e1.CtoA;
	    	CtoBI+=e1.CtoB;
	    	 CtoCI+=e1.CtoC;
	    	 CtoDI+=e1.CtoD;
	    	 DtoAI+=e1.DtoA;
	    	 DtoBI+=e1.DtoB;
	    	 DtoCI+=e1.DtoC;
	    	 DtoDI+=e1.DtoD;
	}
			String dummy="  ";
			Accounts ref	=new Accounts(dummy,AspentI, BspentI, CspentI, DspentI, AtoAI,
					AtoBI, AtoCI, AtoDI, BtoAI, BtoBI, BtoCI, BtoDI, CtoAI, CtoBI, CtoCI, CtoDI,
					DtoAI, DtoBI, DtoCI, DtoDI);
			System.out.println(".....................................................................");
			Iterator it3= n1.Summary.iterator();
			while(it3.hasNext()) {
				System.out.println(it3.next());
			}
			System.out.println();
			System.out.println("......................................................................");
					if(ref.AtoB<0)System.out.println("* "+n1.name.get(1)+" has to pay "+n1.name.get(2)+" "+(-ref.AtoB)+" Rupees.");
					if(ref.AtoC<0)System.out.println("* "+n1.name.get(1)+" has to pay "+n1.name.get(3)+" "+(-ref.AtoC)+" Rupees.");
					if(ref.AtoD<0)System.out.println("* "+n1.name.get(1)+" has to pay "+n1.name.get(4)+" "+(-ref.AtoD)+" Rupees.");
					if(ref.BtoA<0)System.out.println("* "+n1.name.get(2)+" has to pay "+n1.name.get(1)+" "+(-ref.BtoA)+" Rupees.");
					if(ref.BtoC<0)System.out.println("* "+n1.name.get(2)+" has to pay "+n1.name.get(3)+" "+(-ref.BtoC)+" Rupees.");
					if(ref.BtoD<0)System.out.println("* "+n1.name.get(2)+" has to pay "+n1.name.get(4)+" "+(-ref.BtoD)+" Rupees.");
					if(ref.CtoA<0)System.out.println("* "+n1.name.get(3)+" has to pay "+n1.name.get(1)+" "+(-ref.CtoA)+" Rupees.");
					if(ref.CtoB<0)System.out.println("* "+n1.name.get(3)+" has to pay "+n1.name.get(2)+" "+(-ref.CtoB)+" Rupees.");
					if(ref.CtoD<0)System.out.println("* "+n1.name.get(3)+" has to pay "+n1.name.get(4)+" "+(-ref.CtoD)+" Rupees.");
					if(ref.DtoA<0)System.out.println("* "+n1.name.get(4)+" has to pay "+n1.name.get(1)+" "+(-ref.DtoA)+" Rupees.");
					if(ref.DtoB<0)System.out.println("* "+n1.name.get(4)+" has to pay "+n1.name.get(2)+" "+(-ref.DtoB)+" Rupees.");
					if(ref.DtoC<0)System.out.println("* "+n1.name.get(4)+" has to pay "+n1.name.get(3)+" "+(-ref.DtoC)+" Rupees.");
					
	System.out.println("..........................ThankYou...............................");
	
	 
		
	
}

}
