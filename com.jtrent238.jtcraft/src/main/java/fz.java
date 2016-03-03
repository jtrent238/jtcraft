/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fz
/*     */   extends ft
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private int d;
/*     */   private int e;
/*     */   private int f;
/*     */   private int g;
/*     */   private int h;
/*     */   private byte i;
/*     */   private byte j;
/*     */   private byte k;
/*     */   private te l;
/*     */   private List m;
/*     */   
/*     */   public fz() {}
/*     */   
/*     */   public fz(sv paramsv)
/*     */   {
/*  35 */     this.a = paramsv.y();
/*     */     
/*  37 */     this.b = ((byte)sg.a(paramsv));
/*  38 */     this.c = paramsv.as.a(paramsv.s);
/*  39 */     this.d = qh.c(paramsv.t * 32.0D);
/*  40 */     this.e = paramsv.as.a(paramsv.u);
/*  41 */     this.i = ((byte)(int)(paramsv.y * 256.0F / 360.0F));
/*  42 */     this.j = ((byte)(int)(paramsv.z * 256.0F / 360.0F));
/*  43 */     this.k = ((byte)(int)(paramsv.aO * 256.0F / 360.0F));
/*     */     
/*     */ 
/*  46 */     double d1 = 3.9D;
/*  47 */     double d2 = paramsv.v;
/*  48 */     double d3 = paramsv.w;
/*  49 */     double d4 = paramsv.x;
/*  50 */     if (d2 < -d1) d2 = -d1;
/*  51 */     if (d3 < -d1) d3 = -d1;
/*  52 */     if (d4 < -d1) d4 = -d1;
/*  53 */     if (d2 > d1) d2 = d1;
/*  54 */     if (d3 > d1) d3 = d1;
/*  55 */     if (d4 > d1) d4 = d1;
/*  56 */     this.f = ((int)(d2 * 8000.0D));
/*  57 */     this.g = ((int)(d3 * 8000.0D));
/*  58 */     this.h = ((int)(d4 * 8000.0D));
/*     */     
/*  60 */     this.l = paramsv.z();
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  65 */     this.a = paramet.a();
/*  66 */     this.b = (paramet.readByte() & 0xFF);
/*  67 */     this.c = paramet.readInt();
/*  68 */     this.d = paramet.readInt();
/*  69 */     this.e = paramet.readInt();
/*  70 */     this.i = paramet.readByte();
/*  71 */     this.j = paramet.readByte();
/*  72 */     this.k = paramet.readByte();
/*  73 */     this.f = paramet.readShort();
/*  74 */     this.g = paramet.readShort();
/*  75 */     this.h = paramet.readShort();
/*  76 */     this.m = te.b(paramet);
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  81 */     paramet.b(this.a);
/*  82 */     paramet.writeByte(this.b & 0xFF);
/*  83 */     paramet.writeInt(this.c);
/*  84 */     paramet.writeInt(this.d);
/*  85 */     paramet.writeInt(this.e);
/*  86 */     paramet.writeByte(this.i);
/*  87 */     paramet.writeByte(this.j);
/*  88 */     paramet.writeByte(this.k);
/*  89 */     paramet.writeShort(this.f);
/*  90 */     paramet.writeShort(this.g);
/*  91 */     paramet.writeShort(this.h);
/*  92 */     this.l.a(paramet);
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/*  97 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public List c() {
/* 101 */     if (this.m == null) {
/* 102 */       this.m = this.l.c();
/*     */     }
/* 104 */     return this.m;
/*     */   }
/*     */   
/*     */   public String b()
/*     */   {
/* 109 */     return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f, xd=%.2f, yd=%.2f, zd=%.2f", new Object[] { Integer.valueOf(this.a), Integer.valueOf(this.b), Float.valueOf(this.c / 32.0F), Float.valueOf(this.d / 32.0F), Float.valueOf(this.e / 32.0F), Float.valueOf(this.f / 8000.0F), Float.valueOf(this.g / 8000.0F), Float.valueOf(this.h / 8000.0F) });
/*     */   }
/*     */   
/*     */   public int d() {
/* 113 */     return this.a;
/*     */   }
/*     */   
/*     */   public int e() {
/* 117 */     return this.b;
/*     */   }
/*     */   
/*     */   public int f() {
/* 121 */     return this.c;
/*     */   }
/*     */   
/*     */   public int g() {
/* 125 */     return this.d;
/*     */   }
/*     */   
/*     */   public int h() {
/* 129 */     return this.e;
/*     */   }
/*     */   
/*     */   public int i() {
/* 133 */     return this.f;
/*     */   }
/*     */   
/*     */   public int j() {
/* 137 */     return this.g;
/*     */   }
/*     */   
/*     */   public int k() {
/* 141 */     return this.h;
/*     */   }
/*     */   
/*     */   public byte l() {
/* 145 */     return this.i;
/*     */   }
/*     */   
/*     */   public byte m() {
/* 149 */     return this.j;
/*     */   }
/*     */   
/*     */   public byte n() {
/* 153 */     return this.k;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */