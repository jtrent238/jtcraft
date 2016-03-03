/*     */ import java.util.ArrayList;
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
/*     */ public class gu
/*     */   extends ft
/*     */ {
/*     */   private double a;
/*     */   private double b;
/*     */   private double c;
/*     */   private float d;
/*     */   private List e;
/*     */   private float f;
/*     */   private float g;
/*     */   private float h;
/*     */   
/*     */   public gu() {}
/*     */   
/*     */   public gu(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, List paramList, azw paramazw)
/*     */   {
/*  28 */     this.a = paramDouble1;
/*  29 */     this.b = paramDouble2;
/*  30 */     this.c = paramDouble3;
/*  31 */     this.d = paramFloat;
/*  32 */     this.e = new ArrayList(paramList);
/*     */     
/*  34 */     if (paramazw != null) {
/*  35 */       this.f = ((float)paramazw.a);
/*  36 */       this.g = ((float)paramazw.b);
/*  37 */       this.h = ((float)paramazw.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(et paramet)
/*     */   {
/*  43 */     this.a = paramet.readFloat();
/*  44 */     this.b = paramet.readFloat();
/*  45 */     this.c = paramet.readFloat();
/*  46 */     this.d = paramet.readFloat();
/*  47 */     int i = paramet.readInt();
/*     */     
/*  49 */     this.e = new ArrayList(i);
/*     */     
/*  51 */     int j = (int)this.a;
/*  52 */     int k = (int)this.b;
/*  53 */     int m = (int)this.c;
/*  54 */     for (int n = 0; n < i; n++) {
/*  55 */       int i1 = paramet.readByte() + j;
/*  56 */       int i2 = paramet.readByte() + k;
/*  57 */       int i3 = paramet.readByte() + m;
/*  58 */       this.e.add(new agt(i1, i2, i3));
/*     */     }
/*     */     
/*  61 */     this.f = paramet.readFloat();
/*  62 */     this.g = paramet.readFloat();
/*  63 */     this.h = paramet.readFloat();
/*     */   }
/*     */   
/*     */   public void b(et paramet)
/*     */   {
/*  68 */     paramet.writeFloat((float)this.a);
/*  69 */     paramet.writeFloat((float)this.b);
/*  70 */     paramet.writeFloat((float)this.c);
/*  71 */     paramet.writeFloat(this.d);
/*  72 */     paramet.writeInt(this.e.size());
/*     */     
/*  74 */     int i = (int)this.a;
/*  75 */     int j = (int)this.b;
/*  76 */     int k = (int)this.c;
/*  77 */     for (agt localagt : this.e) {
/*  78 */       int m = localagt.a - i;
/*  79 */       int n = localagt.b - j;
/*  80 */       int i1 = localagt.c - k;
/*  81 */       paramet.writeByte(m);
/*  82 */       paramet.writeByte(n);
/*  83 */       paramet.writeByte(i1);
/*     */     }
/*     */     
/*  86 */     paramet.writeFloat(this.f);
/*  87 */     paramet.writeFloat(this.g);
/*  88 */     paramet.writeFloat(this.h);
/*     */   }
/*     */   
/*     */   public void a(fv paramfv)
/*     */   {
/*  93 */     paramfv.a(this);
/*     */   }
/*     */   
/*     */   public float c() {
/*  97 */     return this.f;
/*     */   }
/*     */   
/*     */   public float d() {
/* 101 */     return this.g;
/*     */   }
/*     */   
/*     */   public float e() {
/* 105 */     return this.h;
/*     */   }
/*     */   
/*     */   public double f() {
/* 109 */     return this.a;
/*     */   }
/*     */   
/*     */   public double g() {
/* 113 */     return this.b;
/*     */   }
/*     */   
/*     */   public double h() {
/* 117 */     return this.c;
/*     */   }
/*     */   
/*     */   public float i() {
/* 121 */     return this.d;
/*     */   }
/*     */   
/*     */   public List j() {
/* 125 */     return this.e;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\gu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */