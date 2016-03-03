/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class asw
/*    */   extends ave
/*    */ {
/* 10 */   private double e = 0.004D;
/*    */   
/*    */ 
/*    */   public asw() {}
/*    */   
/*    */   public String a()
/*    */   {
/* 17 */     return "Mineshaft";
/*    */   }
/*    */   
/*    */   public asw(Map paramMap) {
/* 21 */     for (Map.Entry localEntry : paramMap.entrySet()) {
/* 22 */       if (((String)localEntry.getKey()).equals("chance")) {
/* 23 */         this.e = qh.a((String)localEntry.getValue(), this.e);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   protected boolean a(int paramInt1, int paramInt2)
/*    */   {
/* 30 */     return (this.b.nextDouble() < this.e) && (this.b.nextInt(80) < Math.max(Math.abs(paramInt1), Math.abs(paramInt2)));
/*    */   }
/*    */   
/*    */   protected avm b(int paramInt1, int paramInt2)
/*    */   {
/* 35 */     return new atc(this.c, this.b, paramInt1, paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\asw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */