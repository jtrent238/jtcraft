/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class fn
/*     */ {
/*     */   private fn a;
/*     */   private a b;
/*     */   private Boolean c;
/*     */   private Boolean d;
/*     */   private Boolean e;
/*     */   private Boolean f;
/*     */   private Boolean g;
/*     */   private fh h;
/*     */   private fl i;
/*     */   
/*     */   public a a()
/*     */   {
/*  23 */     return this.b == null ? n().a() : this.b;
/*     */   }
/*     */   
/*     */   public boolean b() {
/*  27 */     return this.c == null ? n().b() : this.c.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean c() {
/*  31 */     return this.d == null ? n().c() : this.d.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean d() {
/*  35 */     return this.f == null ? n().d() : this.f.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean e() {
/*  39 */     return this.e == null ? n().e() : this.e.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean f() {
/*  43 */     return this.g == null ? n().f() : this.g.booleanValue();
/*     */   }
/*     */   
/*     */   public boolean g() {
/*  47 */     return (this.c == null) && (this.d == null) && (this.f == null) && (this.e == null) && (this.g == null) && (this.b == null) && (this.h == null) && (this.i == null);
/*     */   }
/*     */   
/*     */   public fh h() {
/*  51 */     return this.h == null ? n().h() : this.h;
/*     */   }
/*     */   
/*     */   public fl i() {
/*  55 */     return this.i == null ? n().i() : this.i;
/*     */   }
/*     */   
/*     */   public fn a(a parama) {
/*  59 */     this.b = parama;
/*  60 */     return this;
/*     */   }
/*     */   
/*     */   public fn a(Boolean paramBoolean) {
/*  64 */     this.c = paramBoolean;
/*  65 */     return this;
/*     */   }
/*     */   
/*     */   public fn b(Boolean paramBoolean) {
/*  69 */     this.d = paramBoolean;
/*  70 */     return this;
/*     */   }
/*     */   
/*     */   public fn c(Boolean paramBoolean) {
/*  74 */     this.f = paramBoolean;
/*  75 */     return this;
/*     */   }
/*     */   
/*     */   public fn d(Boolean paramBoolean) {
/*  79 */     this.e = paramBoolean;
/*  80 */     return this;
/*     */   }
/*     */   
/*     */   public fn e(Boolean paramBoolean) {
/*  84 */     this.g = paramBoolean;
/*  85 */     return this;
/*     */   }
/*     */   
/*     */   public fn a(fh paramfh) {
/*  89 */     this.h = paramfh;
/*  90 */     return this;
/*     */   }
/*     */   
/*     */   public fn a(fl paramfl) {
/*  94 */     this.i = paramfl;
/*  95 */     return this;
/*     */   }
/*     */   
/*     */   public fn a(fn paramfn) {
/*  99 */     this.a = paramfn;
/* 100 */     return this;
/*     */   }
/*     */   
/*     */   public String j() {
/* 104 */     if (g()) {
/* 105 */       if (this.a != null) {
/* 106 */         return this.a.j();
/*     */       }
/* 108 */       return "";
/*     */     }
/*     */     
/*     */ 
/* 112 */     StringBuilder localStringBuilder = new StringBuilder();
/*     */     
/* 114 */     if (a() != null) {
/* 115 */       localStringBuilder.append(a());
/*     */     }
/*     */     
/* 118 */     if (b()) localStringBuilder.append(a.r);
/* 119 */     if (c()) localStringBuilder.append(a.u);
/* 120 */     if (e()) localStringBuilder.append(a.t);
/* 121 */     if (f()) localStringBuilder.append(a.q);
/* 122 */     if (d()) { localStringBuilder.append(a.s);
/*     */     }
/* 124 */     return localStringBuilder.toString();
/*     */   }
/*     */   
/*     */   private fn n() {
/* 128 */     return this.a == null ? j : this.a;
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 147 */     return "Style{hasParent=" + (this.a != null) + ", color=" + this.b + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + h() + ", hoverEvent=" + i() + '}';
/*     */   }
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
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 161 */     if (this == paramObject) return true;
/* 162 */     if ((paramObject instanceof fn))
/*     */     {
/* 164 */       fn localfn = (fn)paramObject;
/*     */       
/* 166 */       return (b() == localfn.b()) && (a() == localfn.a()) && (c() == localfn.c()) && (f() == localfn.f()) && (d() == localfn.d()) && (e() == localfn.e()) && (h() != null ? h().equals(localfn.h()) : localfn.h() == null) && (i() != null ? i().equals(localfn.i()) : localfn.i() == null);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 176 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 181 */     int k = this.b.hashCode();
/* 182 */     k = 31 * k + this.c.hashCode();
/* 183 */     k = 31 * k + this.d.hashCode();
/* 184 */     k = 31 * k + this.e.hashCode();
/* 185 */     k = 31 * k + this.f.hashCode();
/* 186 */     k = 31 * k + this.g.hashCode();
/* 187 */     k = 31 * k + this.h.hashCode();
/* 188 */     k = 31 * k + this.i.hashCode();
/* 189 */     return k;
/*     */   }
/*     */   
/* 192 */   private static final fn j = new fo();
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
/*     */   public fn l()
/*     */   {
/* 218 */     fn localfn = new fn();
/* 219 */     localfn.c = this.c;
/* 220 */     localfn.d = this.d;
/* 221 */     localfn.f = this.f;
/* 222 */     localfn.e = this.e;
/* 223 */     localfn.g = this.g;
/* 224 */     localfn.b = this.b;
/* 225 */     localfn.h = this.h;
/* 226 */     localfn.i = this.i;
/* 227 */     localfn.a = this.a;
/* 228 */     return localfn;
/*     */   }
/*     */   
/*     */   public fn m() {
/* 232 */     fn localfn = new fn();
/*     */     
/* 234 */     localfn.a(Boolean.valueOf(b()));
/* 235 */     localfn.b(Boolean.valueOf(c()));
/* 236 */     localfn.c(Boolean.valueOf(d()));
/* 237 */     localfn.d(Boolean.valueOf(e()));
/* 238 */     localfn.e(Boolean.valueOf(f()));
/* 239 */     localfn.a(a());
/* 240 */     localfn.a(h());
/* 241 */     localfn.a(i());
/*     */     
/* 243 */     return localfn;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */