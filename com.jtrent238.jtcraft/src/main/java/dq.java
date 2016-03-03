/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
/*     */ import java.io.PrintStream;
/*     */ import java.util.List;
/*     */ 
/*     */ public class dq extends dy
/*     */ {
/*   8 */   private List b = new java.util.ArrayList();
/*   9 */   private byte c = 0;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   void a(DataOutput paramDataOutput)
/*     */   {
/*  16 */     if (!this.b.isEmpty()) this.c = ((dy)this.b.get(0)).a(); else {
/*  17 */       this.c = 0;
/*     */     }
/*  19 */     paramDataOutput.writeByte(this.c);
/*  20 */     paramDataOutput.writeInt(this.b.size());
/*  21 */     for (int i = 0; i < this.b.size(); i++) {
/*  22 */       ((dy)this.b.get(i)).a(paramDataOutput);
/*     */     }
/*     */   }
/*     */   
/*     */   void a(DataInput paramDataInput, int paramInt, ds paramds) {
/*  27 */     if (paramInt > 512) {
/*  28 */       throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
/*     */     }
/*  30 */     paramds.a(8L);
/*  31 */     this.c = paramDataInput.readByte();
/*  32 */     int i = paramDataInput.readInt();
/*     */     
/*  34 */     this.b = new java.util.ArrayList();
/*  35 */     for (int j = 0; j < i; j++) {
/*  36 */       dy localdy = dy.a(this.c);
/*  37 */       localdy.a(paramDataInput, paramInt + 1, paramds);
/*  38 */       this.b.add(localdy);
/*     */     }
/*     */   }
/*     */   
/*     */   public byte a()
/*     */   {
/*  44 */     return 9;
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/*  49 */     String str = "[";
/*  50 */     int i = 0;
/*  51 */     for (dy localdy : this.b) {
/*  52 */       str = str + "" + i + ':' + localdy + ',';
/*  53 */       i++;
/*     */     }
/*  55 */     return str + "]";
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
/*     */   public void a(dy paramdy)
/*     */   {
/*  71 */     if (this.c == 0) {
/*  72 */       this.c = paramdy.a();
/*  73 */     } else if (this.c != paramdy.a()) {
/*  74 */       System.err.println("WARNING: Adding mismatching tag types to tag list");
/*  75 */       return;
/*     */     }
/*  77 */     this.b.add(paramdy);
/*     */   }
/*     */   
/*     */   public void a(int paramInt, dy paramdy) {
/*  81 */     if ((paramInt < 0) || (paramInt >= this.b.size())) {
/*  82 */       System.err.println("WARNING: index out of bounds to set tag in tag list");
/*  83 */       return;
/*     */     }
/*  85 */     if (this.c == 0) {
/*  86 */       this.c = paramdy.a();
/*  87 */     } else if (this.c != paramdy.a()) {
/*  88 */       System.err.println("WARNING: Adding mismatching tag types to tag list");
/*  89 */       return;
/*     */     }
/*  91 */     this.b.set(paramInt, paramdy);
/*     */   }
/*     */   
/*     */   public dy a(int paramInt) {
/*  95 */     return (dy)this.b.remove(paramInt);
/*     */   }
/*     */   
/*     */   public dh b(int paramInt) {
/*  99 */     if ((paramInt < 0) || (paramInt >= this.b.size())) {
/* 100 */       return new dh();
/*     */     }
/* 102 */     dy localdy = (dy)this.b.get(paramInt);
/* 103 */     if (localdy.a() == 10) {
/* 104 */       return (dh)localdy;
/*     */     }
/* 106 */     return new dh();
/*     */   }
/*     */   
/*     */   public int[] c(int paramInt) {
/* 110 */     if ((paramInt < 0) || (paramInt >= this.b.size())) {
/* 111 */       return new int[0];
/*     */     }
/* 113 */     dy localdy = (dy)this.b.get(paramInt);
/* 114 */     if (localdy.a() == 11) {
/* 115 */       return ((dn)localdy).c();
/*     */     }
/* 117 */     return new int[0];
/*     */   }
/*     */   
/*     */   public double d(int paramInt) {
/* 121 */     if ((paramInt < 0) || (paramInt >= this.b.size())) {
/* 122 */       return 0.0D;
/*     */     }
/* 124 */     dy localdy = (dy)this.b.get(paramInt);
/* 125 */     if (localdy.a() == 6) {
/* 126 */       return ((dk)localdy).g();
/*     */     }
/* 128 */     return 0.0D;
/*     */   }
/*     */   
/*     */   public float e(int paramInt) {
/* 132 */     if ((paramInt < 0) || (paramInt >= this.b.size())) {
/* 133 */       return 0.0F;
/*     */     }
/* 135 */     dy localdy = (dy)this.b.get(paramInt);
/* 136 */     if (localdy.a() == 5) {
/* 137 */       return ((dm)localdy).h();
/*     */     }
/* 139 */     return 0.0F;
/*     */   }
/*     */   
/*     */   public String f(int paramInt) {
/* 143 */     if ((paramInt < 0) || (paramInt >= this.b.size())) {
/* 144 */       return "";
/*     */     }
/* 146 */     dy localdy = (dy)this.b.get(paramInt);
/* 147 */     if (localdy.a() == 8) {
/* 148 */       return localdy.a_();
/*     */     }
/* 150 */     return localdy.toString();
/*     */   }
/*     */   
/*     */   public int c() {
/* 154 */     return this.b.size();
/*     */   }
/*     */   
/*     */   public dy b()
/*     */   {
/* 159 */     dq localdq = new dq();
/* 160 */     localdq.c = this.c;
/* 161 */     for (dy localdy1 : this.b) {
/* 162 */       dy localdy2 = localdy1.b();
/* 163 */       localdq.b.add(localdy2);
/*     */     }
/* 165 */     return localdq;
/*     */   }
/*     */   
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 170 */     if (super.equals(paramObject)) {
/* 171 */       dq localdq = (dq)paramObject;
/* 172 */       if (this.c == localdq.c) {
/* 173 */         return this.b.equals(localdq.b);
/*     */       }
/*     */     }
/* 176 */     return false;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 181 */     return super.hashCode() ^ this.b.hashCode();
/*     */   }
/*     */   
/*     */   public int d() {
/* 185 */     return this.c;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */