/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class jo
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private int b;
/*    */   private int c;
/*    */   private int d;
/*    */   private add e;
/*    */   private float f;
/*    */   private float g;
/*    */   private float h;
/*    */   
/*    */   public jo() {}
/*    */   
/*    */   public jo(int paramInt1, int paramInt2, int paramInt3, int paramInt4, add paramadd, float paramFloat1, float paramFloat2, float paramFloat3)
/*    */   {
/* 24 */     this.a = paramInt1;
/* 25 */     this.b = paramInt2;
/* 26 */     this.c = paramInt3;
/* 27 */     this.d = paramInt4;
/* 28 */     this.e = (paramadd != null ? paramadd.m() : null);
/* 29 */     this.f = paramFloat1;
/* 30 */     this.g = paramFloat2;
/* 31 */     this.h = paramFloat3;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 36 */     this.a = paramet.readInt();
/* 37 */     this.b = paramet.readUnsignedByte();
/* 38 */     this.c = paramet.readInt();
/* 39 */     this.d = paramet.readUnsignedByte();
/* 40 */     this.e = paramet.c();
/* 41 */     this.f = (paramet.readUnsignedByte() / 16.0F);
/* 42 */     this.g = (paramet.readUnsignedByte() / 16.0F);
/* 43 */     this.h = (paramet.readUnsignedByte() / 16.0F);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 48 */     paramet.writeInt(this.a);
/* 49 */     paramet.writeByte(this.b);
/* 50 */     paramet.writeInt(this.c);
/* 51 */     paramet.writeByte(this.d);
/* 52 */     paramet.a(this.e);
/* 53 */     paramet.writeByte((int)(this.f * 16.0F));
/* 54 */     paramet.writeByte((int)(this.g * 16.0F));
/* 55 */     paramet.writeByte((int)(this.h * 16.0F));
/*    */   }
/*    */   
/*    */   public void a(io paramio)
/*    */   {
/* 60 */     paramio.a(this);
/*    */   }
/*    */   
/*    */   public int c() {
/* 64 */     return this.a;
/*    */   }
/*    */   
/*    */   public int d() {
/* 68 */     return this.b;
/*    */   }
/*    */   
/*    */   public int e() {
/* 72 */     return this.c;
/*    */   }
/*    */   
/*    */   public int f() {
/* 76 */     return this.d;
/*    */   }
/*    */   
/*    */   public add g() {
/* 80 */     return this.e;
/*    */   }
/*    */   
/*    */   public float h() {
/* 84 */     return this.f;
/*    */   }
/*    */   
/*    */   public float i() {
/* 88 */     return this.g;
/*    */   }
/*    */   
/*    */   public float j() {
/* 92 */     return this.h;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\jo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */