/*    */ import java.util.Arrays;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class avn
/*    */   extends ave
/*    */ {
/* 15 */   public static final List e = Arrays.asList(new ahu[] { ahu.p, ahu.q, ahu.X });
/*    */   
/*    */   private int f;
/* 18 */   private int g = 32;
/* 19 */   private int h = 8;
/*    */   
/*    */ 
/*    */   public avn() {}
/*    */   
/*    */   public avn(Map paramMap)
/*    */   {
/* 26 */     this();
/*    */     
/* 28 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/* 29 */       if (((String)localEntry.getKey()).equals("size")) {
/* 30 */         this.f = qh.a((String)localEntry.getValue(), this.f, 0);
/* 31 */       } else if (((String)localEntry.getKey()).equals("distance")) {
/* 32 */         this.g = qh.a((String)localEntry.getValue(), this.g, this.h + 1);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 39 */     return "Village";
/*    */   }
/*    */   
/*    */ 
/*    */   protected boolean a(int paramInt1, int paramInt2)
/*    */   {
/* 45 */     int i = paramInt1;
/* 46 */     int j = paramInt2;
/* 47 */     if (paramInt1 < 0) paramInt1 -= this.g - 1;
/* 48 */     if (paramInt2 < 0) { paramInt2 -= this.g - 1;
/*    */     }
/* 50 */     int k = paramInt1 / this.g;
/* 51 */     int m = paramInt2 / this.g;
/* 52 */     Random localRandom = this.c.A(k, m, 10387312);
/* 53 */     k *= this.g;
/* 54 */     m *= this.g;
/* 55 */     k += localRandom.nextInt(this.g - this.h);
/* 56 */     m += localRandom.nextInt(this.g - this.h);
/* 57 */     paramInt1 = i;
/* 58 */     paramInt2 = j;
/*    */     
/* 60 */     if ((paramInt1 == k) && (paramInt2 == m)) {
/* 61 */       boolean bool = this.c.v().a(paramInt1 * 16 + 8, paramInt2 * 16 + 8, 0, e);
/* 62 */       if (bool) {
/* 63 */         return true;
/*    */       }
/*    */     }
/*    */     
/* 67 */     return false;
/*    */   }
/*    */   
/*    */ 
/*    */   protected avm b(int paramInt1, int paramInt2)
/*    */   {
/* 73 */     return new avo(this.c, this.b, paramInt1, paramInt2, this.f);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\avn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */