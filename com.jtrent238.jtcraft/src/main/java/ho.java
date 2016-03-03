/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ho
/*    */   extends ft
/*    */ {
/*    */   private String a;
/*    */   private boolean b;
/*    */   private int c;
/*    */   
/*    */   public ho() {}
/*    */   
/*    */   public ho(String paramString, boolean paramBoolean, int paramInt)
/*    */   {
/* 20 */     this.a = paramString;
/* 21 */     this.b = paramBoolean;
/* 22 */     this.c = paramInt;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 27 */     this.a = paramet.c(16);
/* 28 */     this.b = paramet.readBoolean();
/* 29 */     this.c = paramet.readShort();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 34 */     paramet.a(this.a);
/* 35 */     paramet.writeBoolean(this.b);
/* 36 */     paramet.writeShort(this.c);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 41 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String c() {
/* 45 */     return this.a;
/*    */   }
/*    */   
/*    */   public boolean d() {
/* 49 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 53 */     return this.c;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ho.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */