/*     */ import java.io.PrintStream;
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
/*     */ public class rw
/*     */ {
/*     */   private int a;
/*     */   private int b;
/*     */   private int c;
/*     */   private boolean d;
/*     */   private boolean e;
/*     */   private boolean f;
/*     */   
/*     */   public rw(int paramInt1, int paramInt2)
/*     */   {
/*  23 */     this(paramInt1, paramInt2, 0);
/*     */   }
/*     */   
/*     */   public rw(int paramInt1, int paramInt2, int paramInt3) {
/*  27 */     this(paramInt1, paramInt2, paramInt3, false);
/*     */   }
/*     */   
/*     */   public rw(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/*  31 */     this.a = paramInt1;
/*  32 */     this.b = paramInt2;
/*  33 */     this.c = paramInt3;
/*  34 */     this.e = paramBoolean;
/*     */   }
/*     */   
/*     */   public rw(rw paramrw) {
/*  38 */     this.a = paramrw.a;
/*  39 */     this.b = paramrw.b;
/*  40 */     this.c = paramrw.c;
/*     */   }
/*     */   
/*     */   public void a(rw paramrw) {
/*  44 */     if (this.a != paramrw.a) {
/*  45 */       System.err.println("This method should only be called for matching effects!");
/*     */     }
/*  47 */     if (paramrw.c > this.c) {
/*  48 */       this.c = paramrw.c;
/*  49 */       this.b = paramrw.b;
/*  50 */     } else if ((paramrw.c == this.c) && (this.b < paramrw.b)) {
/*  51 */       this.b = paramrw.b;
/*  52 */     } else if ((!paramrw.e) && (this.e)) {
/*  53 */       this.e = paramrw.e;
/*     */     }
/*     */   }
/*     */   
/*     */   public int a() {
/*  58 */     return this.a;
/*     */   }
/*     */   
/*     */   public int b() {
/*  62 */     return this.b;
/*     */   }
/*     */   
/*     */   public int c() {
/*  66 */     return this.c;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(boolean paramBoolean)
/*     */   {
/*  74 */     this.d = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  78 */     return this.e;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean a(sv paramsv)
/*     */   {
/*  88 */     if (this.b > 0) {
/*  89 */       if (rv.a[this.a].a(this.b, this.c)) {
/*  90 */         b(paramsv);
/*     */       }
/*  92 */       h();
/*     */     }
/*  94 */     return this.b > 0;
/*     */   }
/*     */   
/*     */   private int h() {
/*  98 */     return --this.b;
/*     */   }
/*     */   
/*     */   public void b(sv paramsv) {
/* 102 */     if (this.b > 0) {
/* 103 */       rv.a[this.a].a(paramsv, this.c);
/*     */     }
/*     */   }
/*     */   
/*     */   public String f() {
/* 108 */     return rv.a[this.a].a();
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 113 */     return this.a;
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 118 */     String str = "";
/* 119 */     if (c() > 0) {
/* 120 */       str = f() + " x " + (c() + 1) + ", Duration: " + b();
/*     */     } else {
/* 122 */       str = f() + ", Duration: " + b();
/*     */     }
/* 124 */     if (this.d) {
/* 125 */       str = str + ", Splash: true";
/*     */     }
/* 127 */     if (rv.a[this.a].i()) {
/* 128 */       return "(" + str + ")";
/*     */     }
/* 130 */     return str;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 135 */     if (!(paramObject instanceof rw)) {
/* 136 */       return false;
/*     */     }
/* 138 */     rw localrw = (rw)paramObject;
/* 139 */     return (this.a == localrw.a) && (this.c == localrw.c) && (this.b == localrw.b) && (this.d == localrw.d) && (this.e == localrw.e);
/*     */   }
/*     */   
/*     */   public dh a(dh paramdh) {
/* 143 */     paramdh.a("Id", (byte)a());
/* 144 */     paramdh.a("Amplifier", (byte)c());
/* 145 */     paramdh.a("Duration", b());
/* 146 */     paramdh.a("Ambient", e());
/* 147 */     return paramdh;
/*     */   }
/*     */   
/*     */   public static rw b(dh paramdh) {
/* 151 */     int i = paramdh.d("Id");
/* 152 */     if ((i < 0) || (i >= rv.a.length) || (rv.a[i] == null)) {
/* 153 */       return null;
/*     */     }
/* 155 */     int j = paramdh.d("Amplifier");
/* 156 */     int k = paramdh.f("Duration");
/* 157 */     boolean bool = paramdh.n("Ambient");
/* 158 */     return new rw(i, k, j, bool);
/*     */   }
/*     */   
/*     */   public void b(boolean paramBoolean) {
/* 162 */     this.f = paramBoolean;
/*     */   }
/*     */   
/*     */   public boolean g() {
/* 166 */     return this.f;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\rw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */