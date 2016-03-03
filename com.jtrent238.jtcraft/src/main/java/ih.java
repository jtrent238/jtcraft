/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ih
/*    */   extends ft
/*    */ {
/*    */   private long a;
/*    */   private long b;
/*    */   
/*    */   public ih() {}
/*    */   
/*    */   public ih(long paramLong1, long paramLong2, boolean paramBoolean)
/*    */   {
/* 16 */     this.a = paramLong1;
/* 17 */     this.b = paramLong2;
/*    */     
/* 19 */     if (!paramBoolean) {
/* 20 */       this.b = (-this.b);
/* 21 */       if (this.b == 0L) {
/* 22 */         this.b = -1L;
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 29 */     this.a = paramet.readLong();
/* 30 */     this.b = paramet.readLong();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 35 */     paramet.writeLong(this.a);
/* 36 */     paramet.writeLong(this.b);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 41 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 46 */     return String.format("time=%d,dtime=%d", new Object[] { Long.valueOf(this.a), Long.valueOf(this.b) });
/*    */   }
/*    */   
/*    */   public long c() {
/* 50 */     return this.a;
/*    */   }
/*    */   
/*    */   public long d() {
/* 54 */     return this.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */