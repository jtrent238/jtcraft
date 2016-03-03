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
/*    */ public class hs
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private rd b;
/*    */   private ahk c;
/*    */   private ahm d;
/*    */   
/*    */   public hs() {}
/*    */   
/*    */   public hs(int paramInt, rd paramrd, ahm paramahm, ahk paramahk)
/*    */   {
/* 24 */     this.a = paramInt;
/* 25 */     this.b = paramrd;
/* 26 */     this.c = paramahk;
/* 27 */     this.d = paramahm;
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 32 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 37 */     this.a = paramet.readInt();
/* 38 */     this.b = rd.a(paramet.readUnsignedByte());
/* 39 */     this.c = ahk.a(paramet.readUnsignedByte());
/* 40 */     this.d = ahm.a(paramet.c(16));
/* 41 */     if (this.d == null) {
/* 42 */       this.d = ahm.b;
/*    */     }
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 48 */     paramet.writeInt(this.a);
/* 49 */     paramet.writeByte(this.b.a());
/* 50 */     paramet.writeByte(this.c.a());
/* 51 */     paramet.a(this.d.a());
/*    */   }
/*    */   
/*    */   public int c() {
/* 55 */     return this.a;
/*    */   }
/*    */   
/*    */   public rd d() {
/* 59 */     return this.b;
/*    */   }
/*    */   
/*    */   public ahk e() {
/* 63 */     return this.c;
/*    */   }
/*    */   
/*    */   public ahm f() {
/* 67 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */