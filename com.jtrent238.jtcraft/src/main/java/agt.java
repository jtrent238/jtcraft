/*    */ 
/*    */ public class agt
/*    */ {
/*    */   public final int a;
/*    */   public final int b;
/*    */   public final int c;
/*    */   
/*    */   public agt(int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 10 */     this.a = paramInt1;
/* 11 */     this.b = paramInt2;
/* 12 */     this.c = paramInt3;
/*    */   }
/*    */   
/*    */   public agt(azw paramazw) {
/* 16 */     this(qh.c(paramazw.a), qh.c(paramazw.b), qh.c(paramazw.c));
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/* 20 */     if ((paramObject instanceof agt))
/*    */     {
/* 22 */       agt localagt = (agt)paramObject;
/* 23 */       return (localagt.a == this.a) && (localagt.b == this.b) && (localagt.c == this.c);
/*    */     }
/*    */     
/* 26 */     return false;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 30 */     return this.a * 8976890 + this.b * 981131 + this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\agt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */