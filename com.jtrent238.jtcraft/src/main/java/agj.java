/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class agj
/*    */   extends aft
/*    */ {
/*    */   public agj(int paramInt1, int paramInt2)
/*    */   {
/* 15 */     super(paramInt1, paramInt2, afu.e);
/*    */     
/* 17 */     b("thorns");
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 22 */     return 10 + 20 * (paramInt - 1);
/*    */   }
/*    */   
/*    */   public int b(int paramInt)
/*    */   {
/* 27 */     return super.a(paramInt) + 50;
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 32 */     return 3;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd)
/*    */   {
/* 37 */     if ((paramadd.b() instanceof abb)) return true;
/* 38 */     return super.a(paramadd);
/*    */   }
/*    */   
/*    */   public void b(sv paramsv, sa paramsa, int paramInt)
/*    */   {
/* 43 */     Random localRandom = paramsv.aI();
/* 44 */     add localadd = afv.a(aft.k, paramsv);
/*    */     
/* 46 */     if (a(paramInt, localRandom)) {
/* 47 */       paramsa.a(ro.a(paramsv), b(paramInt, localRandom));
/* 48 */       paramsa.a("damage.thorns", 0.5F, 1.0F);
/*    */       
/* 50 */       if (localadd != null) {
/* 51 */         localadd.a(3, paramsv);
/*    */       }
/*    */     }
/* 54 */     else if (localadd != null) {
/* 55 */       localadd.a(1, paramsv);
/*    */     }
/*    */   }
/*    */   
/*    */   public static boolean a(int paramInt, Random paramRandom)
/*    */   {
/* 61 */     if (paramInt <= 0) return false;
/* 62 */     return paramRandom.nextFloat() < 0.15F * paramInt;
/*    */   }
/*    */   
/*    */   public static int b(int paramInt, Random paramRandom) {
/* 66 */     if (paramInt > 10) {
/* 67 */       return paramInt - 10;
/*    */     }
/* 69 */     return 1 + paramRandom.nextInt(4);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */