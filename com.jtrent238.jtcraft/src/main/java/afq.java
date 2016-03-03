/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class afq
/*    */   extends aft
/*    */ {
/* 14 */   private static final String[] E = { "all", "undead", "arthropods" };
/*    */   
/*    */ 
/*    */ 
/* 18 */   private static final int[] F = { 1, 5, 5 };
/*    */   
/*    */ 
/*    */ 
/* 22 */   private static final int[] G = { 11, 8, 8 };
/*    */   
/*    */ 
/*    */ 
/* 26 */   private static final int[] H = { 20, 20, 20 };
/*    */   
/*    */   public final int a;
/*    */   
/*    */ 
/*    */   public afq(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 33 */     super(paramInt1, paramInt2, afu.g);
/* 34 */     this.a = paramInt3;
/*    */   }
/*    */   
/*    */   public int a(int paramInt)
/*    */   {
/* 39 */     return F[this.a] + (paramInt - 1) * G[this.a];
/*    */   }
/*    */   
/*    */   public int b(int paramInt)
/*    */   {
/* 44 */     return a(paramInt) + H[this.a];
/*    */   }
/*    */   
/*    */   public int b()
/*    */   {
/* 49 */     return 5;
/*    */   }
/*    */   
/*    */   public float a(int paramInt, sz paramsz)
/*    */   {
/* 54 */     if (this.a == 0) {
/* 55 */       return paramInt * 1.25F;
/*    */     }
/* 57 */     if ((this.a == 1) && (paramsz == sz.b)) {
/* 58 */       return paramInt * 2.5F;
/*    */     }
/* 60 */     if ((this.a == 2) && (paramsz == sz.c)) {
/* 61 */       return paramInt * 2.5F;
/*    */     }
/* 63 */     return 0.0F;
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 68 */     return "enchantment.damage." + E[this.a];
/*    */   }
/*    */   
/*    */   public boolean a(aft paramaft)
/*    */   {
/* 73 */     return !(paramaft instanceof afq);
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd)
/*    */   {
/* 78 */     if ((paramadd.b() instanceof abf)) return true;
/* 79 */     return super.a(paramadd);
/*    */   }
/*    */   
/*    */   public void a(sv paramsv, sa paramsa, int paramInt)
/*    */   {
/* 84 */     if ((paramsa instanceof sv)) {
/* 85 */       sv localsv = (sv)paramsa;
/*    */       
/* 87 */       if ((this.a == 2) && (localsv.bd() == sz.c)) {
/* 88 */         int i = 20 + paramsv.aI().nextInt(10 * paramInt);
/* 89 */         localsv.c(new rw(rv.d.H, i, 3));
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\afq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */