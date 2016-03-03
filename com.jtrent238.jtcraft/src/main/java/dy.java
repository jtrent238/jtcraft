/*     */ import java.io.DataInput;
/*     */ import java.io.DataOutput;
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
/*     */ public abstract class dy
/*     */ {
/*  19 */   public static final String[] a = { "END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]" };
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   abstract void a(DataOutput paramDataOutput);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   abstract void a(DataInput paramDataInput, int paramInt, ds paramds);
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public abstract String toString();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public abstract byte a();
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected static dy a(byte paramByte)
/*     */   {
/*  53 */     switch (paramByte) {
/*     */     case 0: 
/*  55 */       return new dl();
/*     */     case 1: 
/*  57 */       return new dg();
/*     */     case 2: 
/*  59 */       return new dw();
/*     */     case 3: 
/*  61 */       return new dp();
/*     */     case 4: 
/*  63 */       return new dr();
/*     */     case 5: 
/*  65 */       return new dm();
/*     */     case 6: 
/*  67 */       return new dk();
/*     */     case 7: 
/*  69 */       return new df();
/*     */     case 11: 
/*  71 */       return new dn();
/*     */     case 8: 
/*  73 */       return new dx();
/*     */     case 9: 
/*  75 */       return new dq();
/*     */     case 10: 
/*  77 */       return new dh();
/*     */     }
/*  79 */     return null;
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
/*     */ 
/*     */ 
/*     */   public abstract dy b();
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
/*     */   public boolean equals(Object paramObject)
/*     */   {
/* 118 */     if (!(paramObject instanceof dy)) {
/* 119 */       return false;
/*     */     }
/* 121 */     dy localdy = (dy)paramObject;
/* 122 */     if (a() != localdy.a()) {
/* 123 */       return false;
/*     */     }
/* 125 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode()
/*     */   {
/* 130 */     return a();
/*     */   }
/*     */   
/*     */   protected String a_() {
/* 134 */     return toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\dy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */