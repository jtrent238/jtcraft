/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class akl
/*    */   extends aji
/*    */ {
/* 19 */   public static final String[] a = { "default", "default", "podzol" };
/*    */   
/*    */   private rf b;
/*    */   
/*    */   private rf M;
/*    */   
/*    */   protected akl()
/*    */   {
/* 27 */     super(awt.c);
/* 28 */     a(abt.b);
/*    */   }
/*    */   
/*    */   public rf a(int paramInt1, int paramInt2)
/*    */   {
/* 33 */     if (paramInt2 == 2) {
/* 34 */       if (paramInt1 == 1)
/* 35 */         return this.b;
/* 36 */       if (paramInt1 != 0) {
/* 37 */         return this.M;
/*    */       }
/*    */     }
/* 40 */     return this.L;
/*    */   }
/*    */   
/*    */   public rf e(ahl paramahl, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*    */   {
/* 45 */     int i = paramahl.e(paramInt1, paramInt2, paramInt3);
/* 46 */     if (i == 2) {
/* 47 */       if (paramInt4 == 1)
/* 48 */         return this.b;
/* 49 */       if (paramInt4 != 0) {
/* 50 */         awt localawt = paramahl.a(paramInt1, paramInt2 + 1, paramInt3).o();
/* 51 */         if ((localawt == awt.y) || (localawt == awt.z)) {
/* 52 */           return ajn.c.e(paramahl, paramInt1, paramInt2, paramInt3, paramInt4);
/*    */         }
/* 54 */         aji localaji = paramahl.a(paramInt1, paramInt2 + 1, paramInt3);
/* 55 */         if ((localaji != ajn.d) && (localaji != ajn.c)) {
/* 56 */           return this.M;
/*    */         }
/*    */       }
/*    */     }
/* 60 */     return this.L;
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 65 */     return 0;
/*    */   }
/*    */   
/*    */   protected add j(int paramInt)
/*    */   {
/* 70 */     if (paramInt == 1) paramInt = 0;
/* 71 */     return super.j(paramInt);
/*    */   }
/*    */   
/*    */   public void a(adb paramadb, abt paramabt, List paramList)
/*    */   {
/* 76 */     paramList.add(new add(this, 1, 0));
/* 77 */     paramList.add(new add(this, 1, 2));
/*    */   }
/*    */   
/*    */   public void a(rg paramrg)
/*    */   {
/* 82 */     super.a(paramrg);
/*    */     
/* 84 */     this.b = paramrg.a(N() + "_" + "podzol_top");
/* 85 */     this.M = paramrg.a(N() + "_" + "podzol_side");
/*    */   }
/*    */   
/*    */   public int k(ahb paramahb, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 90 */     int i = paramahb.e(paramInt1, paramInt2, paramInt3);
/* 91 */     if (i == 1) {
/* 92 */       i = 0;
/*    */     }
/* 94 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\akl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */