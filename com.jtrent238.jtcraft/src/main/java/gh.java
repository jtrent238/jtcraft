/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class gh
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private aji d;
/*    */   private int e;
/*    */   
/*    */   public gh() {}
/*    */   
/*    */   public gh(int paramInt1, int paramInt2, int paramInt3, ahb paramahb)
/*    */   {
/* 23 */     this.a = paramInt1;
/* 24 */     this.b = paramInt2;
/* 25 */     this.c = paramInt3;
/* 26 */     this.d = paramahb.a(paramInt1, paramInt2, paramInt3);
/* 27 */     this.e = paramahb.e(paramInt1, paramInt2, paramInt3);
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 32 */     this.a = paramet.readInt();
/* 33 */     this.b = paramet.readUnsignedByte();
/* 34 */     this.c = paramet.readInt();
/* 35 */     this.d = aji.e(paramet.a());
/* 36 */     this.e = paramet.readUnsignedByte();
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 41 */     paramet.writeInt(this.a);
/* 42 */     paramet.writeByte(this.b);
/* 43 */     paramet.writeInt(this.c);
/* 44 */     paramet.b(aji.b(this.d));
/* 45 */     paramet.writeByte(this.e);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 50 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public String b()
/*    */   {
/* 55 */     return String.format("type=%d, data=%d, x=%d, y=%d, z=%d", new Object[] { Integer.valueOf(aji.b(this.d)), Integer.valueOf(this.e), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c) });
/*    */   }
/*    */   
/*    */   public aji c() {
/* 59 */     return this.d;
/*    */   }
/*    */   
/*    */   public int d() {
/* 63 */     return this.a;
/*    */   }
/*    */   
/*    */   public int e() {
/* 67 */     return this.b;
/*    */   }
/*    */   
/*    */   public int f() {
/* 71 */     return this.c;
/*    */   }
/*    */   
/*    */   public int g() {
/* 75 */     return this.e;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */