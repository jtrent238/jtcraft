/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afi
/*    */   implements afg
/*    */ {
/*    */   private final add a;
/*    */   private final List b;
/*    */   
/*    */   public afi(add paramadd, List paramList)
/*    */   {
/* 15 */     this.a = paramadd;
/* 16 */     this.b = paramList;
/*    */   }
/*    */   
/*    */   public add b()
/*    */   {
/* 21 */     return this.a;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(aae paramaae, ahb paramahb)
/*    */   {
/* 27 */     ArrayList localArrayList = new ArrayList(this.b);
/*    */     
/* 29 */     for (int i = 0; i < 3; i++) {
/* 30 */       for (int j = 0; j < 3; j++) {
/* 31 */         add localadd1 = paramaae.b(j, i);
/*    */         
/* 33 */         if (localadd1 != null) {
/* 34 */           int k = 0;
/* 35 */           for (add localadd2 : localArrayList) {
/* 36 */             if ((localadd1.b() == localadd2.b()) && ((localadd2.k() == 32767) || (localadd1.k() == localadd2.k()))) {
/* 37 */               k = 1;
/* 38 */               localArrayList.remove(localadd2);
/* 39 */               break;
/*    */             }
/*    */           }
/* 42 */           if (k == 0) {
/* 43 */             return false;
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 49 */     return localArrayList.isEmpty();
/*    */   }
/*    */   
/*    */   public add a(aae paramaae)
/*    */   {
/* 54 */     return this.a.m();
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 59 */     return this.b.size();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */