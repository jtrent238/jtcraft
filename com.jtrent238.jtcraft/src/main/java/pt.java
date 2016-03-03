/*     */ import java.io.PrintStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.security.InvalidKeyException;
/*     */ import java.security.Key;
/*     */ import java.security.KeyFactory;
/*     */ import java.security.KeyPairGenerator;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.PublicKey;
/*     */ import javax.crypto.BadPaddingException;
/*     */ import javax.crypto.Cipher;
/*     */ import javax.crypto.KeyGenerator;
/*     */ import javax.crypto.NoSuchPaddingException;
/*     */ import javax.crypto.SecretKey;
/*     */ 
/*     */ public class pt
/*     */ {
/*     */   public static SecretKey a()
/*     */   {
/*     */     try
/*     */     {
/*  22 */       KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES");
/*  23 */       localKeyGenerator.init(128);
/*  24 */       return localKeyGenerator.generateKey();
/*     */     } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
/*  26 */       throw new Error(localNoSuchAlgorithmException);
/*     */     }
/*     */   }
/*     */   
/*     */   public static java.security.KeyPair b() {
/*     */     try {
/*  32 */       KeyPairGenerator localKeyPairGenerator = KeyPairGenerator.getInstance("RSA");
/*  33 */       localKeyPairGenerator.initialize(1024);
/*     */       
/*  35 */       return localKeyPairGenerator.generateKeyPair();
/*     */     } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
/*  37 */       localNoSuchAlgorithmException.printStackTrace();
/*     */       
/*  39 */       System.err.println("Key pair generation failed!"); }
/*  40 */     return null;
/*     */   }
/*     */   
/*     */   public static byte[] a(String paramString, PublicKey paramPublicKey, SecretKey paramSecretKey) {
/*     */     try {
/*  45 */       return a("SHA-1", new byte[][] { paramString.getBytes("ISO_8859_1"), paramSecretKey.getEncoded(), paramPublicKey.getEncoded() });
/*     */ 
/*     */ 
/*     */     }
/*     */     catch (UnsupportedEncodingException localUnsupportedEncodingException)
/*     */     {
/*     */ 
/*  52 */       localUnsupportedEncodingException.printStackTrace();
/*     */     }
/*     */     
/*  55 */     return null;
/*     */   }
/*     */   
/*     */   private static byte[] a(String paramString, byte[]... paramVarArgs) {
/*     */     try {
/*  60 */       MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
/*  61 */       for (byte[] arrayOfByte1 : paramVarArgs) {
/*  62 */         localMessageDigest.update(arrayOfByte1);
/*     */       }
/*  64 */       return localMessageDigest.digest();
/*     */     } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
/*  66 */       localNoSuchAlgorithmException.printStackTrace();
/*     */     }
/*     */     
/*  69 */     return null;
/*     */   }
/*     */   
/*     */   public static PublicKey a(byte[] paramArrayOfByte) {
/*     */     try {
/*  74 */       java.security.spec.X509EncodedKeySpec localX509EncodedKeySpec = new java.security.spec.X509EncodedKeySpec(paramArrayOfByte);
/*  75 */       KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
/*  76 */       return localKeyFactory.generatePublic(localX509EncodedKeySpec);
/*     */     }
/*     */     catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}catch (java.security.spec.InvalidKeySpecException localInvalidKeySpecException) {}
/*     */     
/*  80 */     System.err.println("Public key reconstitute failed!");
/*  81 */     return null;
/*     */   }
/*     */   
/*     */   public static SecretKey a(java.security.PrivateKey paramPrivateKey, byte[] paramArrayOfByte) {
/*  85 */     return new javax.crypto.spec.SecretKeySpec(b(paramPrivateKey, paramArrayOfByte), "AES");
/*     */   }
/*     */   
/*     */   public static byte[] a(Key paramKey, byte[] paramArrayOfByte) {
/*  89 */     return a(1, paramKey, paramArrayOfByte);
/*     */   }
/*     */   
/*     */   public static byte[] b(Key paramKey, byte[] paramArrayOfByte) {
/*  93 */     return a(2, paramKey, paramArrayOfByte);
/*     */   }
/*     */   
/*     */   private static byte[] a(int paramInt, Key paramKey, byte[] paramArrayOfByte) {
/*     */     try {
/*  98 */       return a(paramInt, paramKey.getAlgorithm(), paramKey).doFinal(paramArrayOfByte);
/*     */     } catch (javax.crypto.IllegalBlockSizeException localIllegalBlockSizeException) {
/* 100 */       localIllegalBlockSizeException.printStackTrace();
/*     */     } catch (BadPaddingException localBadPaddingException) {
/* 102 */       localBadPaddingException.printStackTrace();
/*     */     }
/* 104 */     System.err.println("Cipher data failed!");
/* 105 */     return null;
/*     */   }
/*     */   
/*     */   private static Cipher a(int paramInt, String paramString, Key paramKey) {
/*     */     try {
/* 110 */       Cipher localCipher = Cipher.getInstance(paramString);
/* 111 */       localCipher.init(paramInt, paramKey);
/* 112 */       return localCipher;
/*     */     } catch (InvalidKeyException localInvalidKeyException) {
/* 114 */       localInvalidKeyException.printStackTrace();
/*     */     } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
/* 116 */       localNoSuchAlgorithmException.printStackTrace();
/*     */     } catch (NoSuchPaddingException localNoSuchPaddingException) {
/* 118 */       localNoSuchPaddingException.printStackTrace();
/*     */     }
/* 120 */     System.err.println("Cipher creation failed!");
/* 121 */     return null;
/*     */   }
/*     */   
/*     */   public static Cipher a(int paramInt, Key paramKey) {
/*     */     try {
/* 126 */       Cipher localCipher = Cipher.getInstance("AES/CFB8/NoPadding");
/* 127 */       localCipher.init(paramInt, paramKey, new javax.crypto.spec.IvParameterSpec(paramKey.getEncoded()));
/* 128 */       return localCipher;
/*     */     } catch (java.security.GeneralSecurityException localGeneralSecurityException) {
/* 130 */       throw new RuntimeException(localGeneralSecurityException);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\pt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */