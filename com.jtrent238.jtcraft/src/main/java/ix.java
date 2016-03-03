/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ix
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private short d;
/*    */   private add e;
/*    */   private int f;
/*    */   
/*    */   public ix() {}
/*    */   
/*    */   public ix(int paramInt1, int paramInt2, int paramInt3, int paramInt4, add paramadd, short paramShort)
/*    */   {
/* 22 */     this.a = paramInt1;
/* 23 */     this.b = paramInt2;
/* 24 */     this.c = paramInt3;
/* 25 */     this.e = (paramadd != null ? paramadd.m() : null);
/* 26 */     this.d = paramShort;
/* 27 */     this.f = paramInt4;
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 32 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 37 */     this.a = paramet.readByte();
/* 38 */     this.b = paramet.readShort();
/* 39 */     this.c = paramet.readByte();
/* 40 */     this.d = paramet.readShort();
/* 41 */     this.f = paramet.readByte();
/*    */     
/* 43 */     this.e = paramet.c();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 48 */     paramet.writeByte(this.a);
/* 49 */     paramet.writeShort(this.b);
/* 50 */     paramet.writeByte(this.c);
/* 51 */     paramet.writeShort(this.d);
/* 52 */     paramet.writeByte(this.f);
/*    */     
/* 54 */     paramet.a(this.e);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 59 */     if (this.e != null) {
/* 60 */       return String.format("id=%d, slot=%d, button=%d, type=%d, itemid=%d, itemcount=%d, itemaux=%d", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(adb.b(this.e.b())), Integer.valueOf(this.e.b), Integer.valueOf(this.e.k()) });
/*    */     }
/*    */     
/* 63 */     return String.format("id=%d, slot=%d, button=%d, type=%d, itemid=-1", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.f) });
/*    */   }
/*    */   
/*    */   public int c()
/*    */   {
/* 68 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 72 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 76 */     return this.c;
/*    */   }
/*    */   
/*    */   public short f() {
/* 80 */     return this.d;
/*    */   }
/*    */   
/*    */   public add g() {
/* 84 */     return this.e;
/*    */   }
/*    */   
/*    */   public int h() {
/* 88 */     return this.f;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */